package com.ljh.ToolUtil;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ljh.returnjson.ResultObject;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.*;

public class ParseXml {

    public static HashMap<String,String> parseXml(String xml) throws DocumentException {
//        SAXReader saxReader = new SAXReader();
        Document document = null;
        HashMap<String,String> hashMap = new HashMap<>();
        try {
            document = DocumentHelper.parseText(xml);
            Element root = document.getRootElement();
//            System.out.println(root.element("Body").asXML());


            Iterator iterator = root.elementIterator();
            while(iterator.hasNext()){
                Element element = (Element) iterator.next();
                Iterator iterator1 = element.elementIterator();
                while(iterator1.hasNext()){
                    Element element1 = (Element) iterator1.next();
//                    System.out.println(element1.getName());
                    hashMap.put(element1.getName(),element1.getText());
                }
//            System.out.println(element.getName());
            }
//            System.out.println(hashMap);
        } catch (DocumentException e) {
            e.printStackTrace();
            throw new DocumentException(e.getMessage());
        }

        return hashMap;
    }

    public static List<String> parseXmltoArray(String xml,String nodeName,String subNodename) throws DocumentException {
//        SAXReader saxReader = new SAXReader();
        Document document = null;
        List<String> list = new ArrayList<>();
        try {
            document = DocumentHelper.parseText(xml);
            Element root = document.getRootElement();
            Element input = root.element("Input");
            Element node = input.element(nodeName);

            Iterator iterator = node.elementIterator();

            while(iterator.hasNext()){
                Element element = (Element) iterator.next();
                list.add(element.element(subNodename).getText());
            }
        } catch (DocumentException e) {
            e.printStackTrace();
            throw new DocumentException(e.getMessage());
        }

        return list;
    }

    public static String loadXml(String path){
        SAXReader reader = new SAXReader();
        Document document = null;
        try {
           document  = reader.read(new File(path));
        } catch (DocumentException e) {
            e.printStackTrace();
        }

        String xml = "";
        xml = document.asXML();
        return xml;
    }

    public static String addXml(String path,String xml) throws DocumentException {
        SAXReader reader = new SAXReader();
        Document document = null;
        Document appendDocument = null;
        try {
            document = reader.read(new File(path));
            appendDocument = DocumentHelper.parseText(xml);
        } catch (DocumentException e) {
            e.printStackTrace();
            throw new DocumentException(e.getMessage());
        }

        Element appendXml = appendDocument.getRootElement();
        Element root = document.getRootElement();
        Element body = root.element("Output");
        body.add(appendXml);
        return document.asXML();
    }

    public static String addResponse(String targetXml, ResultObject result) throws DocumentException {
        Document document = null;
        try {
            document = DocumentHelper.parseText(targetXml);
        } catch (DocumentException e) {
            e.printStackTrace();
            throw new DocumentException(e.getMessage());
        }

        Element root = document.getRootElement();
        Element code = root.element("Code");
        Element message = root.element("Message");
        code.setText(result.getCode());
        message.setText(result.getMessage());
        return document.asXML();
    }


    /**
     * 将xml转换为JSON对象
     * @param xml xml字符串
     * @return
     * @throws Exception
     */
    public static JSONObject xmltoJson(String xml) throws Exception {
        JSONObject jsonObject = new JSONObject();
        Document document = DocumentHelper.parseText(xml);
        //获取根节点元素对象
        Element root = document.getRootElement();
        iterateNodes(root, jsonObject);
        return jsonObject;
    }



    /**
     * 遍历元素
     * @param node 元素
     * @param json 将元素遍历完成之后放的JSON对象
     */
    @SuppressWarnings("unchecked")
    public static void iterateNodes(Element node,JSONObject json){
        //获取当前元素的名称
        String nodeName = node.getName();
        //判断已遍历的JSON中是否已经有了该元素的名称
        if(json.containsKey(nodeName)){
            //该元素在同级下有多个
            Object Object = json.get(nodeName);
            JSONArray array = null;
            if(Object instanceof JSONArray){
                array = (JSONArray) Object;
            }else {
                array = new JSONArray();
                array.add(Object);
            }
            //获取该元素下所有子元素
            List<Element> listElement = node.elements();
            if(listElement.isEmpty()){
                //该元素无子元素，获取元素的值
                String nodeValue = node.getTextTrim();
                array.add(nodeValue);
                json.put(nodeName, array);
                return ;
            }
            //有子元素
            JSONObject newJson = new JSONObject();
            //遍历所有子元素
            for(Element e:listElement){
                //递归
                iterateNodes(e,newJson);
            }
            array.add(newJson);
            json.put(nodeName, array);
            return ;
        }
        //该元素同级下第一次遍历
        //获取该元素下所有子元素
        List<Element> listElement = node.elements();
        if(listElement.isEmpty()){
            //该元素无子元素，获取元素的值
            String nodeValue = node.getTextTrim();
            json.put(nodeName, nodeValue);
            return ;
        }
        //有子节点，新建一个JSONObject来存储该节点下子节点的值
        JSONObject object = new JSONObject();
        //遍历所有一级子节点
        for(Element e:listElement){
            //递归
            iterateNodes(e,object);
        }
        json.put(nodeName, object);
        return ;
    }



}
