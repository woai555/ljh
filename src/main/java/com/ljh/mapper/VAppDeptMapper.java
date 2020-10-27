package com.ljh.mapper;

import com.ljh.bean.VAppDept;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Component;

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
public interface VAppDeptMapper extends BaseMapper<VAppDept> {

    public List<VAppDept> appDept();
}
