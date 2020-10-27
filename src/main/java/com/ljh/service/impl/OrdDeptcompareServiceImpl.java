package com.ljh.service.impl;

import com.ljh.bean.OrdDeptcompare;
import com.ljh.mapper.OrdDeptcompareMapper;
import com.ljh.service.OrdDeptcompareService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 急诊科室和住院科室的对照(用于预约住院统计中的急诊患者信息) 服务实现类
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
@Service
public class OrdDeptcompareServiceImpl extends ServiceImpl<OrdDeptcompareMapper, OrdDeptcompare> implements OrdDeptcompareService {

}
