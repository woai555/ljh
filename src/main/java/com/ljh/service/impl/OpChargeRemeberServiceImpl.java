package com.ljh.service.impl;

import com.ljh.bean.OpChargeRemeber;
import com.ljh.mapper.OpChargeRemeberMapper;
import com.ljh.service.OpChargeRemeberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 对于价格为空的项目，记录其输入的价格 服务实现类
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
@Service
public class OpChargeRemeberServiceImpl extends ServiceImpl<OpChargeRemeberMapper, OpChargeRemeber> implements OpChargeRemeberService {

}
