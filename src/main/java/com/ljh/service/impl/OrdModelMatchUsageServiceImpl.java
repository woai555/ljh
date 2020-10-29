package com.ljh.service.impl;

import com.ljh.bean.OrdModelMatchUsage;
import com.ljh.daoMz.OrdModelMatchUsageMapper;
import com.ljh.service.OrdModelMatchUsageService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用法和剂型是否匹配，用于判断医生处方开立是否合理 服务实现类
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
@Service
public class OrdModelMatchUsageServiceImpl extends ServiceImpl<OrdModelMatchUsageMapper, OrdModelMatchUsage> implements OrdModelMatchUsageService {

}
