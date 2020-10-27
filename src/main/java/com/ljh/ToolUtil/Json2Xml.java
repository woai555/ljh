package com.ljh.ToolUtil;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.ljh.bean.VAppDept;
import com.ljh.returnjson.ResultObject;
import org.dom4j.DocumentException;

import java.lang.reflect.Field;
import java.util.List;

public class Json2Xml<T> {
    public Json2Xml() {
    }

    public String jsonToXml(List<T> list, String node, String subNode,ResultObject resultObject) throws DocumentException {

        if(resultObject.getCode() != "0"){
            String xml = "";
            xml = ParseXml.loadXml("Response.xml");
            xml = ParseXml.addResponse(xml,resultObject);
            return xml;
        }

        String jsonStr = JSON.toJSONString(list, SerializerFeature.WriteMapNullValue,SerializerFeature.WriteNullStringAsEmpty);
//        T t = new T();
        Field[] fields = list.get(0).getClass().getDeclaredFields();
        String lastfild = fields[fields.length - 1].getName();
        System.out.println(lastfild);

        jsonStr = jsonStr.replaceAll("\\[",node == "" ? "":"<" + node + ">")
                .replaceAll("\\{\"", subNode == ""? "<":"<" + subNode + "><")
                .replaceAll("\":\"", ">")
                .replaceAll("\",\"", "<")
                .replaceAll("\":",">")
                .replaceAll(",\"","<")
                .replaceAll("\"\\},", "</"+lastfild + (subNode == "" ? ">":"></" + subNode + ">"))
                .replaceAll("\"\\}", "</"+lastfild + (subNode == "" ? ">":"></" + subNode + ">"))
                .replaceAll("\\},", "</" + lastfild + (subNode == "" ? ">":"></" + subNode + ">"))
                .replaceAll("\\}","</" + lastfild + (subNode == "" ? ">":"></" + subNode + ">"))
                .replaceAll("\\]", node == "" ? "":"</" + node + ">")
                .replaceAll("null","");

        System.out.println(jsonStr);
//
        String preFieldName = "";
        for(int i=0;i<fields.length;i++){
            String fileName =fields[i].getName();
            System.out.println(fileName);
            if(i!=0){
                if(!preFieldName.isEmpty()){
                    jsonStr = jsonStr.replaceAll("<"+fileName+">", "</"+preFieldName+"><"+fileName+">");
                }
                preFieldName = fields[i].getName();
            }

        }
        jsonStr = ParseXml.addXml("Response.xml",jsonStr);
        jsonStr = ParseXml.addResponse(jsonStr,resultObject);
        return jsonStr;
    }
}
