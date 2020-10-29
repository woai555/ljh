package com.ljh.service.impl;

import com.ljh.bean.OrdUsageSetqty;
import com.ljh.daoMz.OrdUsageSetqtyMapper;
import com.ljh.service.OrdUsageSetqtyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 对于用法内的项目,根据单次剂量*频次*天数生成数量 服务实现类
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
@Service
public class OrdUsageSetqtyServiceImpl extends ServiceImpl<OrdUsageSetqtyMapper, OrdUsageSetqty> implements OrdUsageSetqtyService {

}
