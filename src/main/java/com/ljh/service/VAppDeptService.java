package com.ljh.service;

import com.ljh.bean.VAppDept;
import com.baomidou.mybatisplus.extension.service.IService;
import org.dom4j.DocumentException;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public interface VAppDeptService extends IService<VAppDept> {
    public String appDept() throws DocumentException;

}
