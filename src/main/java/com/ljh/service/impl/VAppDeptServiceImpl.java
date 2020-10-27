package com.ljh.service.impl;

import com.ljh.ToolUtil.Json2Xml;
import com.ljh.bean.VAppDept;
import com.ljh.mapper.VAppDeptMapper;
import com.ljh.returnjson.ResultObject;
import com.ljh.service.VAppDeptService;
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
public class VAppDeptServiceImpl extends ServiceImpl<VAppDeptMapper, VAppDept> implements VAppDeptService {

    @Autowired
    private VAppDeptMapper mapper;

    @Override
    public String appDept() throws DocumentException {
        System.out.println("service in");
        List<VAppDept> vAppDepts = mapper.appDept();
        Json2Xml<VAppDept> json2Xml = new Json2Xml<>();
        String returnStr = "";
        if(vAppDepts.size() > 0){
           returnStr  = json2Xml.jsonToXml(vAppDepts,"DeptList","Dept",new ResultObject("0",""));
        }else {
            returnStr  = json2Xml.jsonToXml(vAppDepts,"DeptList","Dept",new ResultObject("1","科室信息查询失败"));
        }
        return returnStr;
    }
}
