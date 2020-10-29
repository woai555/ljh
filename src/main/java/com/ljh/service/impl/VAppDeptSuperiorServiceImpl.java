package com.ljh.service.impl;

import com.ljh.ToolUtil.Json2Xml;
import com.ljh.bean.VAppDeptSuperior;
import com.ljh.daoMz.VAppDeptSuperiorMapper;
import com.ljh.returnjson.ResultObject;
import com.ljh.service.VAppDeptSuperiorService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.dom4j.DocumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
public class VAppDeptSuperiorServiceImpl extends ServiceImpl<VAppDeptSuperiorMapper, VAppDeptSuperior> implements VAppDeptSuperiorService {

    @Autowired
    private VAppDeptSuperiorMapper mapper;
    @Override
    public String getSect() throws DocumentException {
        System.out.println("service in");
        List<VAppDeptSuperior> vAppDepts = mapper.getSect();
        Json2Xml<VAppDeptSuperior> json2Xml = new Json2Xml<>();
        String returnStr = "";
        if(vAppDepts.size() > 0){
            returnStr  = json2Xml.jsonToXml(vAppDepts,"SectList","Sect",new ResultObject("0",""));
        }else {
            returnStr  = json2Xml.jsonToXml(vAppDepts,"SectList","Sect",new ResultObject("1","大科室信息查询失败"));
        }
        return returnStr;
    }
}
