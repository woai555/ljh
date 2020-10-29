package com.ljh.daoMz;

import com.ljh.bean.VAppSchedule;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
@Component
public interface VAppScheduleMapper extends BaseMapper<VAppSchedule> {

    List<VAppSchedule> getSchedule(HashMap<String,String> map);
}
