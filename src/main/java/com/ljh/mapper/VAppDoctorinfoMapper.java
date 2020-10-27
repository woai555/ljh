package com.ljh.mapper;

import com.ljh.bean.VAppDoctorinfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
@Component
public interface VAppDoctorinfoMapper extends BaseMapper<VAppDoctorinfo> {

    List<VAppDoctorinfo> getDoctor(HashMap<String, String> map);
}
