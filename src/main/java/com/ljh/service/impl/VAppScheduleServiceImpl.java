package com.ljh.service.impl;

import com.ljh.ToolUtil.Json2Xml;
import com.ljh.ToolUtil.ParseXml;
import com.ljh.bean.VAppSchedule;
import com.ljh.daoMz.VAppScheduleMapper;
import com.ljh.returnjson.ResultObject;
import com.ljh.service.VAppScheduleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.dom4j.DocumentException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
public class VAppScheduleServiceImpl extends ServiceImpl<VAppScheduleMapper, VAppSchedule> implements VAppScheduleService {

    @Autowired
    private VAppScheduleMapper mapper;


    private static final Logger logger = LoggerFactory.getLogger(VAppScheduleServiceImpl.class);


    @Override
    public String getSchedule(String message) throws Exception {

        HashMap<String,String> map = new HashMap<>();
        try {
            map = ParseXml.parseXml(message);
        } catch (DocumentException e) {
            e.printStackTrace();
            throw new DocumentException();
        }

        System.out.println(map);
        logger.info("开始执行sql");
        List<VAppSchedule> list = mapper.getSchedule(map);
        logger.info("获取数据完成");
        Json2Xml<VAppSchedule> json2Xml = new Json2Xml<>();
        String returnStr = "";
        if(list.size() > 0){
            returnStr  = json2Xml.jsonToXml(list,"ScheduleList","Schedule",new ResultObject("0",""));
        }else {
            returnStr  = json2Xml.jsonToXml(list,"ScheduleList","ScheduleList",new ResultObject("1","号源信息查询失败"));
        }
        return returnStr;
    }
}
