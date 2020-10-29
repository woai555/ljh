package com.ljh.daoMz;

import com.ljh.bean.VAppDeptSuperior;
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
public interface VAppDeptSuperiorMapper extends BaseMapper<VAppDeptSuperior> {
    public List<VAppDeptSuperior> getSect();
}
