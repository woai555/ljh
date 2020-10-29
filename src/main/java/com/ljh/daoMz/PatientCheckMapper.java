package com.ljh.daoMz;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ljh.bean.PatientCheck;
import com.ljh.bean.VAppSchedule;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

@Component
public interface PatientCheckMapper extends BaseMapper<PatientCheck> {
    void patientCheck(HashMap<String, String> map);
}
