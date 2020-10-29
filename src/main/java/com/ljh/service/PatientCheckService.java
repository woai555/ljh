package com.ljh.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ljh.bean.PatientCheck;
import org.dom4j.DocumentException;
import org.springframework.stereotype.Service;

@Service
public interface PatientCheckService extends IService<PatientCheck> {
    public String patientCheck(String message) throws DocumentException;
}
