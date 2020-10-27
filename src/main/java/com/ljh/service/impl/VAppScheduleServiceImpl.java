package com.ljh.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ljh.ToolUtil.Json2Xml;
import com.ljh.ToolUtil.ParseXml;
import com.ljh.bean.Sendinfo;
import com.ljh.bean.VAppDoctorinfo;
import com.ljh.bean.VAppSchedule;
import com.ljh.mapper.VAppScheduleMapper;
import com.ljh.returnjson.ResultObject;
import com.ljh.service.VAppScheduleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.dom4j.DocumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
@Service
public class VAppScheduleServiceImpl extends ServiceImpl<VAppScheduleMapper, VAppSchedule> implements VAppScheduleService {

    @Autowired
    private VAppScheduleMapper mapper;

    @Override
    public String getRemainQuery(String message) throws DocumentException {

        List<Map<String, String>> list = new ArrayList<>();

        try {
            list = ParseXml.parseXmltoArray(message, "ScheduleList");
        }catch (DocumentException e){
            throw new DocumentException();
        }

        List<VAppSchedule> vAppSchedules = mapper.getRemainQuery(list);
        return "";
    }
}
