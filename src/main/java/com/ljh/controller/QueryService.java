package com.ljh.controller;

import org.dom4j.DocumentException;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface QueryService {
    @WebMethod
    public String HIPMessageServer(String action,String Message) throws Exception;
}
