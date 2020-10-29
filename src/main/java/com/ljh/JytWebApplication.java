package com.ljh;

import com.ljh.controller.Impl.QueryController;
import com.ljh.controller.QueryService;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.ws.Endpoint;

@SpringBootApplication
@MapperScan("com.ljh.mapper")
public class JytWebApplication {

    private static final Logger logger = LoggerFactory.getLogger(JytWebApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(JytWebApplication.class,args);
//        String url = "http://localhost:9999/HLHTService.asmx";
//        Endpoint.publish(url,queryService);
//        System.out.println("发布成功");
            logger.info("发布成功");
    }
}
