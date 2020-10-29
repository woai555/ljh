package com.ljh;

//import com.alibaba.fastjson.JSON;
//import com.alibaba.fastjson.JSONArray;
//import com.alibaba.fastjson.JSONObject;
//import com.alibaba.fastjson.serializer.SerializerFeature;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.ljh.ToolUtil.Json2Xml;
//import com.ljh.ToolUtil.ParseXml;
//import com.ljh.bean.VAppDept;
//import com.sun.xml.internal.ws.util.xml.XmlUtil;
//import org.dom4j.Document;
//import org.dom4j.DocumentException;
//import org.dom4j.DocumentHelper;
//import org.dom4j.Element;
//import org.dom4j.io.SAXReader;
//import org.xml.sax.InputSource;
//import org.xml.sax.SAXException;
//import org.xml.sax.helpers.DefaultHandler;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;

import javax.xml.parsers.*;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.*;

public class Test {
//    public static String mapToXml(Map<String,Object> map,Boolean isCdata){
//        String parentName ="xml";
//        Document doc = DocumentHelper.createDocument();
//        map.keySet().forEach(key->{
//            doc.addElement(key);
//
//        });
//
//
//    }
//
//
//
//
//
//    public static void main(String[] args) throws Exception {
//
//        HashMap<String,String> map = new HashMap<>();
//        map.put("appcode","");
//        map.put("errmsg","");
//        map.put("aaa","");
//        map.put("bbb","");
//
////        String xml = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
////                "<Request> \n" +
////                "  \n" +
////                "  <Input> \n" +
////                "<xml>1231233</xml>\n" +
////                "<tests>" +
////                "<test><t>test1</t></test>" +
////                "<test><t>test2</t></test>" +
////                "<test><t>test3</t></test>" +
////                "</tests>" +
////                "</Input> \n" +
////                "</Request>";
//////
//////        String text = "<Request> \n" +
//////                "  \n" +
//////                "  <Body> \n" +
//////                "<xml>1231233</xml>\n" +
//////                "<OPERATE_TYPE/>\n" +
//////                "</Body> \n" +
//////                "</Request>";
////        JSONObject jsonObject = ParseXml.xmltoJson(xml);
////        System.out.println(jsonObject);
////        System.out.println(jsonObject.getJSONObject("Request").getJSONObject("Input").getJSONObject("tests").getString("test"));
////        String s = jsonObject.getJSONObject("Request").getJSONObject("Input").getJSONObject("tests").getString("test");
////
////
////        List<String> list = Arrays.asList(s.replaceAll("\"","").replaceAll("\\[","").replaceAll("\\]","").split(","));
////        System.out.println(list);
////        System.out.println(ParseXml.parseXmltoArray(xml,"tests","t"));
//////
////////        System.out.println(ParseXml.addXml("F:\\test.xml",text));
//////        //解析xml
//////        //        SAXParserFactory sf = SAXParserFactory.newInstance();
////////        try {
////////            SAXParser sp = sf.newSAXParser();
////////            SAXDemoHandel handel = new SAXDemoHandel();
////////            sp.parse(new InputSource("F:\\test.xml"),handel);
////////        } catch (ParserConfigurationException e) {
////////            e.printStackTrace();
////////        } catch (SAXException e) {
////////            e.printStackTrace();
////////        } catch (IOException e) {
////////            e.printStackTrace();
////////        }
//////
//////
//////        //读取xml文件
////////        SAXReader saxReader = new SAXReader();
////////        Document document = saxReader.read(new File("F:\\test.xml"));
////////        String text = document.asXML();
////////        System.out.println(text);
////////        Element root = document.getRootElement();
////////        System.out.println(root.element("Body").asXML());
////////
////////        Hashtable<String,String> hashtable = new Hashtable<>();
////////        Iterator iterator = root.elementIterator();
////////        while(iterator.hasNext()){
////////            Element element = (Element) iterator.next();
////////            Iterator iterator1 = element.elementIterator();
////////            while(iterator1.hasNext()){
////////                Element element1 = (Element) iterator1.next();
////////                System.out.println(element1.getName());
////////                hashtable.put(element1.getName(),element1.getText());
////////            }
//////////            System.out.println(element.getName());
////////        }
////////        System.out.println(hashtable);
////////        List<VAppDept> list = new ArrayList<>();
////////
////////        for(int i= 0; i < 1; i++){
////////            VAppDept dept = new VAppDept();
////////            dept.setDeptname("疼痛门诊" + i);
////////            dept.setAddr("addr" + i);
////////            dept.setDeptid("deptid" + i);
////////            dept.setDepttype("depttype" + i);
////////            dept.setDetail("detail" + i);
////////            dept.setResume(null);
////////            dept.setSectid(null);
////////            dept.setPriority(null);
////////            list.add(dept);
////////        }
////////
////////        System.out.println(list);
//////
////////        VAppDept dept = new VAppDept();
////////        dept.setDeptname("疼痛门诊");
////////        dept.setAddr("addr" );
////////        dept.setDeptid("deptid" );
////////        dept.setDepttype("depttype");
////////        dept.setDetail("detail" );
////////        dept.setPriority(null);
////////        dept.setResume(null);
////////        dept.setSectid(null);
////////        System.out.println(dept.toString());
////////        String jsonStr = JSON.toJSONString(list, SerializerFeature.WriteMapNullValue,SerializerFeature.WriteNullStringAsEmpty);
////////        System.out.println(jsonStr);
//////
////////        ObjectMapper jsonMapper = new ObjectMapper();
////////        VAppDept vad = jsonMapper.readValue(jsonStr,VAppDept.class);
////////
////////        XmlMapper xmlMapper = new XmlMapper();
////////        System.out.println(xmlMapper.writeValueAsString(vad));
//////
////////        Field[] fields = new VAppDept().getClass().getDeclaredFields();
////////        String lastfild = fields[fields.length - 1].getName();
////////        System.out.println(lastfild);
//////////
////////        String node = "Depts";
////////        String subNode = "Dept";
////////        jsonStr = jsonStr.replaceAll("\\[",node == "" ? "":"<" + node + ">")
////////                .replaceAll("\\{\"", subNode == ""? "<":"<" + subNode + "><")
////////                .replaceAll("\":\"", ">")
////////                .replaceAll("\",\"", "<")
////////                .replaceAll("\":",">")
////////                .replaceAll(",\"","<")
////////                .replaceAll("\"\\},", "</"+lastfild + (subNode == "" ? ">":"></" + subNode + ">"))
////////                .replaceAll("\"\\}", "</"+lastfild + (subNode == "" ? ">":"></" + subNode + ">"))
////////                .replaceAll("\\},", "</" + lastfild + (subNode == "" ? ">":"></" + subNode + ">"))
////////                .replaceAll("\\}","</" + lastfild + (subNode == "" ? ">":"></" + subNode + ">"))
////////                .replaceAll("\\]", node == "" ? "":"</" + node + ">");
////////
////////        System.out.println(jsonStr);
//////////
////////        String preFieldName = "";
////////        for(int i=0;i<fields.length;i++){
////////            String fileName =fields[i].getName();
////////            System.out.println(fileName);
////////            if(i!=0){
////////                if(!preFieldName.isEmpty()){
////////                    jsonStr = jsonStr.replaceAll("<"+fileName+">", "</"+preFieldName+"><"+fileName+">");
////////                }
////////                preFieldName = fields[i].getName();
////////            }
////////
////////        }
////////
////////        String s = "[VAppDept{deptname=疼痛门诊, deptid=0229, sectid=11100581, resume=null, detail=null, addr=门诊一部二层, depttype=0, priority=4}, VAppDept{deptname=智慧家医, deptid=0419, sectid=11560689, resume=null, detail=null, addr=门诊二部一层北侧, depttype=0, priority=48}, VAppDept{deptname=新冠病毒核酸检测门诊(入院筛查患者勿挂), deptid=0440, sectid=11560689, resume=null, detail=null, addr=康复楼北门, depttype=0, priority=50}, VAppDept{deptname=入院筛查门诊(限已开住院证并接到入院通知的患者,选择后查看注意事项), deptid=0435, sectid=11560689, resume=null, detail=null, addr=门诊二部一层北侧, depttype=0, priority=49}, VAppDept{deptname=全科医疗科, deptid=0343, sectid=11560689, resume=null, detail=null, addr=门诊二部一层北侧, depttype=0, priority=1}, VAppDept{deptname=超声波诊断, deptid=0147, sectid=08090608, resume=null, detail=null, addr=医技部一层超声科, depttype=0, priority=1}, VAppDept{deptname=核医学科, deptid=0152, sectid=13320728, resume=null, detail=null, addr=门诊二部地下一层, depttype=0, priority=1}, VAppDept{deptname=分子病理检验, deptid=0180, sectid=08350700, resume=null, detail=null, addr=医技部二层, depttype=0, priority=1}, VAppDept{deptname=健康管理门诊, deptid=0308, sectid=15190788, resume=null, detail=null, addr=门诊一部二层, depttype=0, priority=1}, VAppDept{deptname=神经肿瘤综合诊疗门诊, deptid=0388, sectid=13470528, resume=null, detail=null, addr=门诊一部二层神经外科, depttype=0, priority=46}, VAppDept{deptname=周围神经外科门诊, deptid=0364, sectid=13470528, resume=null, detail=null, addr=门诊一部二层神经外科, depttype=0, priority=45}, VAppDept{deptname=神外内镜肿瘤门诊, deptid=0357, sectid=13470528, resume=null, detail=null, addr=门诊一部二层神经外科, depttype=0, priority=35}, VAppDept{deptname=功能神外癫痫门诊, deptid=0356, sectid=13470528, resume=null, detail=null, addr=门诊一部二层神经外科, depttype=0, priority=34}, VAppDept{deptname=神外脑血管病门诊, deptid=0355, sectid=13470528, resume=null, detail=null, addr=门诊一部三层脑血管病科, depttype=0, priority=33}, VAppDept{deptname=神经外科肿瘤专家门诊, deptid=0354, sectid=13470528, resume=null, detail=null, addr=门诊一部二层神经外科, depttype=0, priority=29}, VAppDept{deptname=神外脊髓脊柱门诊, deptid=0353, sectid=13470528, resume=null, detail=null, addr=门诊一部二层神经外科, depttype=0, priority=32}, VAppDept{deptname=神经系统创伤门诊, deptid=0352, sectid=13470528, resume=null, detail=null, addr=门诊一部二层神经外科, depttype=0, priority=31}, VAppDept{deptname=神经外科小儿门诊, deptid=0351, sectid=13470528, resume=null, detail=null, addr=门诊一部二层神经外科, depttype=0, priority=30}, VAppDept{deptname=神经外科门诊, deptid=0001, sectid=13470528, resume=null, detail=null, addr=门诊一部二层神经外科, depttype=0, priority=2}, VAppDept{deptname=神经内科专家-头痛科门诊, deptid=1422, sectid=13470529, resume=null, detail=null, addr=门诊一部三层神经内科, depttype=0, priority=49}, VAppDept{deptname=神经内科专家-癫痫科门诊, deptid=0253, sectid=13470529, resume=null, detail=null, addr=门诊一部三层神经内科, depttype=0, priority=40}, VAppDept{deptname=神经内科专家-神经感染免疫门诊, deptid=0360, sectid=13470529, resume=null, detail=null, addr=门诊一部三层神经内科, depttype=0, priority=39}, VAppDept{deptname=神经内科专家-神经肌肉遗传门诊, deptid=0359, sectid=13470529, resume=null, detail=null, addr=门诊一部三层神经内科, depttype=0, priority=38}, VAppDept{deptname=神经内科专家-运动障碍和帕金森门诊, deptid=0358, sectid=13470529, resume=null, detail=null, addr=门诊一部三层神经内科, depttype=0, priority=37}, VAppDept{deptname=神经内科综合门诊, deptid=0051, sectid=13470529, resume=null, detail=null, addr=门诊一部三层神经内科, depttype=0, priority=36}, VAppDept{deptname=神经内科专家-记忆和认知障碍门诊, deptid=0363, sectid=13470529, resume=null, detail=null, addr=门诊一部三层神经内科, depttype=0, priority=41}, VAppDept{deptname=血管外科门诊, deptid=1404, sectid=13470530, resume=null, detail=null, addr=门诊二部二层南侧, depttype=0, priority=44}, VAppDept{deptname=减肥与糖尿病外科门诊, deptid=0397, sectid=13470530, resume=null, detail=null, addr=门诊二部二层南侧, depttype=0, priority=45}, VAppDept{deptname=普外科门诊, deptid=0016, sectid=13470530, resume=null, detail=null, addr=门诊二部二层南侧, depttype=0, priority=5}, VAppDept{deptname=骨科门诊, deptid=0024, sectid=13470530, resume=null, detail=null, addr=门诊二部二层南侧, depttype=0, priority=4}, VAppDept{deptname=泌尿外科门诊, deptid=0028, sectid=13470530, resume=null, detail=null, addr=门诊二部二层南侧, depttype=0, priority=3}, VAppDept{deptname=胸外科门诊, deptid=0032, sectid=13470530, resume=null, detail=null, addr=门诊二部二层南侧, depttype=0, priority=2}, VAppDept{deptname=乳腺科门诊, deptid=0303, sectid=13470530, resume=null, detail=null, addr=门诊二部二层南侧, depttype=0, priority=1}, VAppDept{deptname=综合内科门诊, deptid=0036, sectid=13470531, resume=null, detail=null, addr=门诊二部二层北侧, depttype=0, priority=9}, VAppDept{deptname=呼吸内科门诊, deptid=0124, sectid=13470531, resume=null, detail=null, addr=门诊二部二层北侧, depttype=0, priority=6}, VAppDept{deptname=血液内科门诊, deptid=0038, sectid=13470531, resume=null, detail=null, addr=门诊二部二层北侧, depttype=0, priority=5}, VAppDept{deptname=消化内科门诊, deptid=0088, sectid=13470531, resume=null, detail=null, addr=门诊二部二层南侧, depttype=0, priority=4}, VAppDept{deptname=心血管内科门诊, deptid=0092, sectid=13470531, resume=null, detail=null, addr=门诊二部三层北侧, depttype=0, priority=3}, VAppDept{deptname=肾内科门诊, deptid=0101, sectid=13470531, resume=null, detail=null, addr=门诊二部二层南侧, depttype=0, priority=2}, VAppDept{deptname=内分泌科门诊, deptid=0105, sectid=13470531, resume=null, detail=null, addr=门诊二部二层北侧, depttype=0, priority=1}, VAppDept{deptname=血液透析特病专用, deptid=0104, sectid=13470531, resume=null, detail=null, addr=医技部一层, depttype=0, priority=8}, VAppDept{deptname=不孕症门诊, deptid=0447, sectid=13470532, resume=null, detail=null, addr=门诊二部三层南侧, depttype=0, priority=29}, VAppDept{deptname=妇科门诊, deptid=0108, sectid=13470532, resume=null, detail=null, addr=门诊二部三层南侧, depttype=0, priority=2}, VAppDept{deptname=产科门诊, deptid=0109, sectid=13470532, resume=null, detail=null, addr=门诊二部三层南侧, depttype=0, priority=1}, VAppDept{deptname=计划生育门诊, deptid=0113, sectid=13470532, resume=null, detail=null, addr=门诊二部三层南侧, depttype=0, priority=28}, VAppDept{deptname=发热伴皮疹请到分诊台咨询,传染病请到传染病医院就诊, deptid=0130, sectid=13470533, resume=null, detail=null, addr=门诊二部一层北侧, depttype=0, priority=1}, VAppDept{deptname=中医科门诊, deptid=0069, sectid=13470534, resume=null, detail=null, addr=门诊一部一层, depttype=0, priority=1}, VAppDept{deptname=针灸科门诊, deptid=0067, sectid=13470534, resume=null, detail=null, addr=门诊一部一层中医科, depttype=0, priority=3}, VAppDept{deptname=按摩科门诊, deptid=0068, sectid=13470534, resume=null, detail=null, addr=null, depttype=0, priority=2}, VAppDept{deptname=牙槽外科, deptid=0420, sectid=13470535, resume=null, detail=null, addr=门诊一部四层, depttype=0, priority=8}, VAppDept{deptname=口腔初诊, deptid=0414, sectid=13470535, resume=null, detail=null, addr=门诊一部四层, depttype=0, priority=7}, VAppDept{deptname=牙周科, deptid=0382, sectid=13470535, resume=null, detail=null, addr=门诊一部四层, depttype=0, priority=6}, VAppDept{deptname=口腔粘膜科, deptid=0381, sectid=13470535, resume=null, detail=null, addr=门诊一部四层, depttype=0, priority=5}, VAppDept{deptname=口腔预防科, deptid=0441, sectid=13470535, resume=null, detail=null, addr=门诊一部四层, depttype=0, priority=10}, VAppDept{deptname=口腔修复科, deptid=0380, sectid=13470535, resume=null, detail=null, addr=门诊一部四层, depttype=0, priority=4}, VAppDept{deptname=口腔正畸科, deptid=0378, sectid=13470535, resume=null, detail=null, addr=门诊一部四层, depttype=0, priority=3}, VAppDept{deptname=口腔种植科, deptid=0361, sectid=13470535, resume=null, detail=null, addr=门诊一部四层, depttype=0, priority=2}, VAppDept{deptname=牙体牙髓科, deptid=1420, sectid=13470535, resume=null, detail=null, addr=门诊一部四层, depttype=0, priority=9}, VAppDept{deptname=口腔科门诊, deptid=0041, sectid=13470535, resume=null, detail=null, addr=门诊一部四层, depttype=0, priority=1}, VAppDept{deptname=心理科, deptid=0053, sectid=13470536, resume=null, detail=null, addr=门诊一部三层, depttype=0, priority=1}, VAppDept{deptname=麻醉科门诊-麻醉评估(门诊二部), deptid=0411, sectid=13470537, resume=null, detail=null, addr=门诊一部二层, depttype=0, priority=6}, VAppDept{deptname=麻醉科门诊-麻醉评估(门诊一部), deptid=0135, sectid=13470537, resume=null, detail=null, addr=门诊一部二层术前评估中心, depttype=0, priority=5}, VAppDept{deptname=眼科门诊, deptid=0120, sectid=13470539, resume=null, detail=null, addr=门诊一部四层, depttype=0, priority=1}, VAppDept{deptname=耳鼻喉科门诊, deptid=0116, sectid=13470540, resume=null, detail=null, addr=门诊一部四层, depttype=0, priority=1}, VAppDept{deptname=皮肤科门诊, deptid=0086, sectid=13470542, resume=null, detail=null, addr=门诊二部四层北侧, depttype=0, priority=1}, VAppDept{deptname=病理科, deptid=0148, sectid=13470543, resume=null, detail=null, addr=医技部二层, depttype=0, priority=1}, VAppDept{deptname=临床营养科, deptid=0162, sectid=13470544, resume=null, detail=null, addr=门诊二部二层北侧, depttype=0, priority=1}, VAppDept{deptname=伽玛刀(研究所), deptid=0181, sectid=13470546, resume=null, detail=null, addr=门诊一部二层, depttype=0, priority=1}, VAppDept{deptname=高压氧门诊, deptid=0212, sectid=13470548, resume=null, detail=null, addr=康复部一层, depttype=0, priority=2}, VAppDept{deptname=放疗门诊, deptid=0324, sectid=13470550, resume=null, detail=null, addr=门诊一部二层, depttype=0, priority=1}, VAppDept{deptname=特需产科, deptid=0413, sectid=13470552, resume=null, detail=null, addr=门诊一部五层A区(乘4号电梯), depttype=0, priority=22}, VAppDept{deptname=特需心血管外科, deptid=0434, sectid=13470552, resume=null, detail=null, addr=null, depttype=0, priority=19}, VAppDept{deptname=特需普外科, deptid=0433, sectid=13470552, resume=null, detail=null, addr=null, depttype=0, priority=55}, VAppDept{deptname=特需泌尿外科, deptid=0432, sectid=13470552, resume=null, detail=null, addr=null, depttype=0, priority=17}, VAppDept{deptname=特需骨科, deptid=0431, sectid=13470552, resume=null, detail=null, addr=null, depttype=0, priority=16}, VAppDept{deptname=特需心血管内科, deptid=0430, sectid=13470552, resume=null, detail=null, addr=null, depttype=0, priority=15}, VAppDept{deptname=特需消化内科, deptid=0429, sectid=13470552, resume=null, detail=null, addr=null, depttype=0, priority=14}, VAppDept{deptname=特需呼吸内科, deptid=0428, sectid=13470552, resume=null, detail=null, addr=null, depttype=0, priority=13}, VAppDept{deptname=特需内分泌科, deptid=0427, sectid=13470552, resume=null, detail=null, addr=null, depttype=0, priority=12}, VAppDept{deptname=特需无痛胃肠镜联合会诊, deptid=0426, sectid=13470552, resume=null, detail=null, addr=null, depttype=0, priority=9}, VAppDept{deptname=特需神外重症, deptid=0425, sectid=13470552, resume=null, detail=null, addr=null, depttype=0, priority=8}, VAppDept{deptname=特需麻醉科, deptid=0340, sectid=13470552, resume=null, detail=null, addr=门诊一部五层A区(乘4号电梯), depttype=0, priority=52}, VAppDept{deptname=特需口腔科, deptid=0339, sectid=13470552, resume=null, detail=null, addr=null, depttype=0, priority=51}, VAppDept{deptname=特需病理科, deptid=0330, sectid=13470552, resume=null, detail=null, addr=医技部二层病理科, depttype=0, priority=50}, VAppDept{deptname=特需临床营养科, deptid=0329, sectid=13470552, resume=null, detail=null, addr=门诊一部五层A区(乘4号电梯), depttype=0, priority=49}, VAppDept{deptname=特需高压氧, deptid=0328, sectid=13470552, resume=null, detail=null, addr=门诊一部五层A区(乘4号电梯), depttype=0, priority=48}, VAppDept{deptname=特需体检科, deptid=0327, sectid=13470552, resume=null, detail=null, addr=null, depttype=0, priority=47}, VAppDept{deptname=会诊中心, deptid=0214, sectid=13470552, resume=null, detail=null, addr=门诊一部五层A区(乘4号电梯), depttype=0, priority=1}, VAppDept{deptname=特需放疗科, deptid=0323, sectid=13470552, resume=null, detail=null, addr=门诊一部五层A区(乘4号电梯), depttype=0, priority=26}, VAppDept{deptname=特需中医科, deptid=0268, sectid=13470552, resume=null, detail=null, addr=门诊一部五层A区(乘4号电梯), depttype=0, priority=25}, VAppDept{deptname=特需耳鼻喉科, deptid=0267, sectid=13470552, resume=null, detail=null, addr=门诊一部五层A区(乘4号电梯), depttype=0, priority=24}, VAppDept{deptname=特需眼科, deptid=0266, sectid=13470552, resume=null, detail=null, addr=门诊一部五层A区(乘4号电梯), depttype=0, priority=23}, VAppDept{deptname=特需妇科, deptid=0265, sectid=13470552, resume=null, detail=null, addr=门诊一部五层A区(乘4号电梯), depttype=0, priority=21}, VAppDept{deptname=特需皮肤科, deptid=0264, sectid=13470552, resume=null, detail=null, addr=门诊一部五层A区(乘4号电梯), depttype=0, priority=20}, VAppDept{deptname=特需外科, deptid=0263, sectid=13470552, resume=null, detail=null, addr=门诊一部五层A区(乘4号电梯), depttype=0, priority=57}, VAppDept{deptname=特需内科, deptid=0262, sectid=13470552, resume=null, detail=null, addr=门诊一部五层A区(乘4号电梯), depttype=0, priority=56}, VAppDept{deptname=特需疼痛科, deptid=0261, sectid=13470552, resume=null, detail=null, addr=门诊一部五层A区(乘4号电梯), depttype=0, priority=11}, VAppDept{deptname=特需心理科, deptid=0260, sectid=13470552, resume=null, detail=null, addr=门诊一部五层A区(乘4号电梯), depttype=0, priority=10}, VAppDept{deptname=特需神经介入科, deptid=0258, sectid=13470552, resume=null, detail=null, addr=门诊一部五层A区(乘4号电梯), depttype=0, priority=7}, VAppDept{deptname=特需神内, deptid=0257, sectid=13470552, resume=null, detail=null, addr=门诊一部五层A区(乘4号电梯), depttype=0, priority=2}, VAppDept{deptname=特需神外, deptid=0256, sectid=13470552, resume=null, detail=null, addr=门诊一部五层A区(乘4号电梯), depttype=0, priority=3}, VAppDept{deptname=特需神经放射, deptid=0259, sectid=13470552, resume=null, detail=null, addr=门诊一部五层A区(乘4号电梯), depttype=0, priority=4}, VAppDept{deptname=特需伽马刀, deptid=0326, sectid=13470552, resume=null, detail=null, addr=门诊一部五层A区(乘4号电梯), depttype=0, priority=53}, VAppDept{deptname=特需儿科, deptid=0341, sectid=13470552, resume=null, detail=null, addr=门诊一部五层A区(乘4号电梯), depttype=0, priority=54}, VAppDept{deptname=实验诊断中心门诊, deptid=1426, sectid=15481058, resume=null, detail=null, addr=医技楼一层实验诊断中心一部, depttype=0, priority=1}, VAppDept{deptname=眩晕诊疗中心, deptid=0398, sectid=17080780, resume=null, detail=null, addr=门诊一部三层脑血管病科, depttype=0, priority=2}, VAppDept{deptname=房颤卒中患者抗栓门诊, deptid=0443, sectid=17080780, resume=null, detail=null, addr=null, depttype=0, priority=4}, VAppDept{deptname=晕厥及低血压门诊, deptid=0442, sectid=17080780, resume=null, detail=null, addr=null, depttype=0, priority=3}, VAppDept{deptname=脑血管病门诊, deptid=0272, sectid=17080780, resume=null, detail=null, addr=门诊一部三层脑血管病科, depttype=0, priority=1}, VAppDept{deptname=康复医学科门诊, deptid=1402, sectid=17080781, resume=null, detail=null, addr=门诊一部二层, depttype=0, priority=1}, VAppDept{deptname=风湿免疫科门诊, deptid=0399, sectid=12430931, resume=null, detail=null, addr=门诊二部二层北侧, depttype=0, priority=1}, VAppDept{deptname=感染科门诊, deptid=0346, sectid=12430933, resume=null, detail=null, addr=门诊二部二层北侧, depttype=0, priority=1}, VAppDept{deptname=脑转移瘤和肿瘤新药临床研究门诊, deptid=1450, sectid=16010948, resume=null, detail=null, addr=门诊二部二层南侧, depttype=0, priority=4}, VAppDept{deptname=肿瘤个体化治疗门诊, deptid=1449, sectid=16010948, resume=null, detail=null, addr=门诊二部二层南侧, depttype=0, priority=3}, VAppDept{deptname=肿瘤免疫治疗门诊, deptid=1448, sectid=16010948, resume=null, detail=null, addr=门诊二部二层南侧, depttype=0, priority=2}, VAppDept{deptname=肿瘤靶向治疗门诊, deptid=1447, sectid=16010948, resume=null, detail=null, addr=门诊二部二层南侧, depttype=0, priority=1}, VAppDept{deptname=心血管外科门诊, deptid=0309, sectid=15590798, resume=null, detail=null, addr=门诊二部三层北侧, depttype=0, priority=1}, VAppDept{deptname=神经介入科门诊, deptid=0274, sectid=17500808, resume=null, detail=null, addr=门诊一部三层脑血管病科, depttype=0, priority=1}, VAppDept{deptname=创面护理中心门诊, deptid=0408, sectid=08330858, resume=null, detail=null, addr=门诊二部二楼南侧普通外科, depttype=0, priority=6}, VAppDept{deptname=静疗中心护理工作室, deptid=0407, sectid=08330858, resume=null, detail=null, addr=门诊二部二楼南侧乳腺外科, depttype=0, priority=5}, VAppDept{deptname=脑卒中护理咨询门诊, deptid=0406, sectid=08330858, resume=null, detail=null, addr=门诊一部三楼脑血管病中心, depttype=0, priority=4}, VAppDept{deptname=糖尿病护理健康咨询门诊, deptid=0405, sectid=08330858, resume=null, detail=null, addr=门诊二部二楼北侧内分泌科, depttype=0, priority=3}, VAppDept{deptname=柳欣帕金森照护护理工作室, deptid=0404, sectid=08330858, resume=null, detail=null, addr=门诊一部三楼神经内科, depttype=0, priority=2}, VAppDept{deptname=产前咨询门诊, deptid=0403, sectid=08330858, resume=null, detail=null, addr=门诊二部三层妇产科门诊, depttype=0, priority=1}, VAppDept{deptname=癫痫专科护理门诊, deptid=0424, sectid=08330858, resume=null, detail=null, addr=门诊一部二层, depttype=0, priority=7}, VAppDept{deptname=瘢痕门诊, deptid=0350, sectid=09240848, resume=null, detail=null, addr=门诊二部四层北侧, depttype=0, priority=5}, VAppDept{deptname=美容外科, deptid=0400, sectid=09240848, resume=null, detail=null, addr=门诊二部四层北侧, depttype=0, priority=1}, VAppDept{deptname=美容牙科, deptid=0347, sectid=09240848, resume=null, detail=null, addr=门诊一部四层, depttype=0, priority=4}, VAppDept{deptname=美容皮科, deptid=0348, sectid=09240848, resume=null, detail=null, addr=门诊二部四层北侧, depttype=0, priority=3}, VAppDept{deptname=神经内科急诊, deptid=0052, sectid=09500988, resume=null, detail=null, addr=急诊一层, depttype=0, priority=2}, VAppDept{deptname=神经外科急诊, deptid=0002, sectid=09500988, resume=null, detail=null, addr=急诊一层, depttype=0, priority=1}, VAppDept{deptname=妇产科急诊, deptid=0110, sectid=09500988, resume=null, detail=null, addr=急诊一层, depttype=0, priority=13}, VAppDept{deptname=产科急诊, deptid=0319, sectid=09500988, resume=null, detail=null, addr=null, depttype=0, priority=12}, VAppDept{deptname=发热门诊, deptid=0221, sectid=09500988, resume=null, detail=null, addr=感染中心一层, depttype=0, priority=11}, VAppDept{deptname=肠道门诊, deptid=0210, sectid=09500988, resume=null, detail=null, addr=感染中心一层, depttype=0, priority=10}, VAppDept{deptname=口腔科急诊, deptid=0338, sectid=09500988, resume=null, detail=null, addr=急诊一层, depttype=0, priority=9}, VAppDept{deptname=儿科急诊, deptid=0251, sectid=09500988, resume=null, detail=null, addr=门诊二部一层北侧, depttype=0, priority=8}, VAppDept{deptname=眼科急诊, deptid=0121, sectid=09500988, resume=null, detail=null, addr=急诊一层, depttype=0, priority=7}, VAppDept{deptname=耳鼻喉科急诊, deptid=0117, sectid=09500988, resume=null, detail=null, addr=急诊一层, depttype=0, priority=6}, VAppDept{deptname=内科急诊, deptid=0037, sectid=09500988, resume=null, detail=null, addr=急诊一层, depttype=0, priority=5}, VAppDept{deptname=外科急诊, deptid=0017, sectid=09500988, resume=null, detail=null, addr=急诊一层, depttype=0, priority=4}, VAppDept{deptname=胸痛中心, deptid=0391, sectid=09500988, resume=null, detail=null, addr=急诊一层, depttype=0, priority=3}, VAppDept{deptname=痛风多学科联合门诊(建议同时挂两个号), deptid=0446, sectid=14231068, resume=null, detail=null, addr=门诊二部二层北侧, depttype=0, priority=2}, VAppDept{deptname=难治性癫痫多学科联合门诊 (建议同时挂两个号), deptid=0445, sectid=14231068, resume=null, detail=null, addr=门诊一部三层神经内科, depttype=0, priority=3}, VAppDept{deptname=卒中与营养联合管理门诊(建议同时挂两个号), deptid=0444, sectid=14231068, resume=null, detail=null, addr=门诊一部三层脑血管病科, depttype=0, priority=1}, VAppDept{deptname=药物治疗管理门诊, deptid=0418, sectid=11210878, resume=null, detail=null, addr=null, depttype=0, priority=1}, VAppDept{deptname=输血科门诊, deptid=0390, sectid=16030818, resume=null, detail=null, addr=医技部二层东侧走廊输血科等候室, depttype=0, priority=1}, VAppDept{deptname=脑心共患病联合门诊, deptid=0409, sectid=13580868, resume=null, detail=null, addr=门诊二部三层北侧, depttype=0, priority=2}, VAppDept{deptname=脑心共患病初筛门诊, deptid=0410, sectid=13580868, resume=null, detail=null, addr=门诊二部三层北侧, depttype=0, priority=1}]";
////////        System.out.println(text);
//////
//////
////////        XML.toJSONObject(text);
//    }


}
