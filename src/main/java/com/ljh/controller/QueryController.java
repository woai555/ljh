package com.ljh.controller;


import com.ljh.bean.VAppDoctorinfo;
import com.ljh.bean.VAppSchedule;
import com.ljh.service.VAppDeptService;
import com.ljh.service.VAppDeptSuperiorService;
import com.ljh.service.VAppDoctorinfoService;
import com.ljh.service.VAppScheduleService;
import org.dom4j.DocumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
@Controller
public class QueryController {

    @Autowired
    private VAppDeptService vAppDeptService;

    @Autowired
    private VAppDeptSuperiorService vAppDeptSuperiorService;

    @Autowired
    private VAppDoctorinfoService vAppDoctorinfoService;

    @Autowired
    private VAppScheduleService vAppScheduleService;


    @WebMethod
    public String HIPMessageServer(String action,String Message) throws DocumentException {
        String returnXml = "";
        switch (action){
            case "getDept":
                returnXml = vAppDeptService.appDept();
                break;
            case "getSect":
                returnXml = vAppDeptSuperiorService.getSect();
                break;
            case "getDoctor":
                returnXml = vAppDoctorinfoService.getDoctor(Message);
                break;
            case "RemainQuery":
                returnXml = vAppScheduleService.getRemainQuery(Message);
                break;
        }
        return returnXml;
    }
}
