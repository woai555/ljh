package com.ljh.service.impl;

import com.ljh.ToolUtil.Json2Xml;
import com.ljh.ToolUtil.ParseXml;
import com.ljh.bean.VAppRemainquery;
import com.ljh.bean.VAppSchedule;
import com.ljh.daoMz.VAppRemainqueryMapper;
import com.ljh.returnjson.ResultObject;
import com.ljh.service.VAppRemainqueryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.dom4j.DocumentException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
public class VAppRemainqueryServiceImpl extends ServiceImpl<VAppRemainqueryMapper, VAppRemainquery> implements VAppRemainqueryService {

    private static final Logger logger = LoggerFactory.getLogger(VAppRemainqueryService.class);

    @Autowired
    private VAppRemainqueryMapper mapper;
    @Override
    public String getRemainQuery(String message) throws DocumentException {
        List<String> list = new ArrayList<>();

        try {
            list = ParseXml.parseXmltoArray(message, "ScheduleList","AccessSchId");
        }catch (DocumentException e){
            throw new DocumentException();
        }

        System.out.println(list);
        logger.info("开始执行sql");
        List<VAppRemainquery> list1 = mapper.getRemainQuery(list);
        logger.info("获取数据完成");
        Json2Xml<VAppRemainquery> json2Xml = new Json2Xml<>();
        String returnStr = "";
        if(list.size() > 0){
            returnStr  = json2Xml.jsonToXml(list1,"ScheduleList","Schedule",new ResultObject("0",""));
        }else {
            returnStr  = json2Xml.jsonToXml(list1,"ScheduleList","ScheduleList",new ResultObject("1","号源信息查询失败"));
        }
        return returnStr;
    }
}
