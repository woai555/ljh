package com.ljh.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ljh.ToolUtil.Json2Xml;
import com.ljh.ToolUtil.ParseXml;
import com.ljh.bean.VAppDoctorinfo;
import com.ljh.mapper.VAppDoctorinfoMapper;
import com.ljh.returnjson.ResultObject;
import com.ljh.service.VAppDoctorinfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.dom4j.DocumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
@Service
public class VAppDoctorinfoServiceImpl extends ServiceImpl<VAppDoctorinfoMapper, VAppDoctorinfo> implements VAppDoctorinfoService {

    @Autowired
    private VAppDoctorinfoMapper mapper;

    @Override
    public String getDoctor(String message) throws DocumentException {
        HashMap<String,String> map = new HashMap<>();
        try {
            map = ParseXml.parseXml(message);
        } catch (DocumentException e) {
            e.printStackTrace();
            throw new DocumentException();
        }
//
//        String deptId = map.get("DeptId");
//        QueryWrapper queryWrapper = new QueryWrapper();
//        queryWrapper.eq("deptid",deptId);
        List<VAppDoctorinfo> list =  mapper.getDoctor(map);
        Json2Xml<VAppDoctorinfo> json2Xml = new Json2Xml<>();
        String returnStr = "";
        if(list.size() > 0){
            returnStr  = json2Xml.jsonToXml(list,"DoctorList","Doctor",new ResultObject("0",""));
        }else {
            returnStr  = json2Xml.jsonToXml(list,"DoctorList","Doctor",new ResultObject("1","医生信息查询失败"));
        }
        return returnStr;
    }
}
