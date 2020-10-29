package com.ljh.daoMz;

import com.ljh.bean.VAppRemainquery;
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
public interface VAppRemainqueryMapper extends BaseMapper<VAppRemainquery> {

    List<VAppRemainquery> getRemainQuery(List<String> list);
}
