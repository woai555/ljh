package com.ljh.service;

import com.ljh.bean.VAppDoctorinfo;
import com.baomidou.mybatisplus.extension.service.IService;
import org.dom4j.DocumentException;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public interface VAppDoctorinfoService extends IService<VAppDoctorinfo> {

    String getDoctor(String message) throws DocumentException;
}
