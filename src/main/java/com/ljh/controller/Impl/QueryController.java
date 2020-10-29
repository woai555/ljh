package com.ljh.controller.Impl;


import com.ljh.bean.VAppRemainquery;
import com.ljh.controller.QueryService;
import com.ljh.service.*;
import org.dom4j.DocumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

@WebService
@Service
public class QueryController implements QueryService {

    @Autowired
    private VAppDeptService vAppDeptService;

    @Autowired
    private VAppDeptSuperiorService vAppDeptSuperiorService;

    @Autowired
    private VAppDoctorinfoService vAppDoctorinfoService;

    @Autowired
    private VAppScheduleService vAppScheduleService;

    @Autowired
    private VAppRemainqueryService vAppRemainqueryService;
    @Autowired
    private PatientCheckService patientCheckService;

//
//    @WebMethod(operationName = "HIPMessageServer")
    @Override
    public String HIPMessageServer(String action, String Message) throws Exception {
        System.out.println("in");
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
            case "getSchedule":
                returnXml = vAppScheduleService.getSchedule(Message);
                break;
            case "RemainQuery":
                returnXml = vAppRemainqueryService.getRemainQuery(Message);
                break;
            case "PatientCheck":
                returnXml = patientCheckService.patientCheck(Message);
                break;
            default:
                returnXml = "未找到对应的接口，请检查接口入参";
                break;
        }
        System.out.println(returnXml);
        return returnXml;
    }
}
