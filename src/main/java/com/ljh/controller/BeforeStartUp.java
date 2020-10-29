package com.ljh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Service;

import javax.xml.ws.Endpoint;

@Service
public class BeforeStartUp implements ApplicationListener<ContextRefreshedEvent> {
    private static String address = "http://10.0.80.12:8080/HLHTService.asmx";

    @Autowired
    private QueryService queryService;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        Endpoint.publish(address,queryService);
        System.out.println("发布成功");
    }
}
