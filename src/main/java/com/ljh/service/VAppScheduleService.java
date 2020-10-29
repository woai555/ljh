package com.ljh.service;

import com.ljh.bean.VAppSchedule;
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
public interface VAppScheduleService extends IService<VAppSchedule> {

    String getSchedule(String message) throws Exception;
}
