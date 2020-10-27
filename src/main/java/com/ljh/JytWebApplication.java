package com.ljh;

import com.ljh.controller.QueryController;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.ws.Endpoint;

@SpringBootApplication
@MapperScan("com.ljh.mapper")
public class JytWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(JytWebApplication.class,args);
        String url = "http://localhost:9999/HLHTService.asmx";
        Endpoint.publish(url,new QueryController());
        System.out.println("发布成功");

    }
}
