package com.ljh.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ljh.ToolUtil.Json2Xml;
import com.ljh.ToolUtil.ParseXml;
import com.ljh.bean.PatientCheck;
import com.ljh.bean.VAppSchedule;
import com.ljh.daoMz.PatientCheckMapper;
import com.ljh.returnjson.ResultObject;
import com.ljh.service.PatientCheckService;
import org.dom4j.DocumentException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
@Service
public class PatientCheckServiceImpl extends ServiceImpl<PatientCheckMapper, PatientCheck> implements PatientCheckService {
    @Autowired
    private PatientCheckMapper mapper;
    private static final Logger logger = LoggerFactory.getLogger(PatientCheckServiceImpl.class);

    @Override
    public String patientCheck(String message) throws DocumentException {
        HashMap<String,String> map = new HashMap<>();
        try {
            map = ParseXml.parseXml(message);
        } catch (DocumentException e) {
            e.printStackTrace();
            throw new DocumentException();
        }

        map.put("accesspatid","");
        map.put("patientid","");
        map.put("appcode","");
        map.put("errmsg","");
        System.out.println(map);
        logger.info("开始执行sql");
        mapper.patientCheck(map);
        System.out.println("after" + map);
        List<PatientCheck> list = new ArrayList<>();
//        list.add(pc);
        System.out.println(list);
        logger.info("获取数据完成");
        Json2Xml<PatientCheck> json2Xml = new Json2Xml<>();
        String returnStr = "";
        PatientCheck pc = new PatientCheck();
        pc.setAccesspatid(map.get(""));
        if(map.get("appcode") == "0"){
            returnStr  = json2Xml.jsonToXml(list,"","",new ResultObject("0",""));
        }else {
            returnStr  = json2Xml.jsonToXml(list,"","",new ResultObject("1",map.get("errmsg")));
        }
        return returnStr;
    }
}
