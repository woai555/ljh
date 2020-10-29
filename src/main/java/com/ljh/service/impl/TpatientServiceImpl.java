package com.ljh.service.impl;

import com.ljh.bean.Tpatient;
import com.ljh.daoMz.TpatientMapper;
import com.ljh.service.TpatientService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 病历主表 服务实现类
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
@Service
public class TpatientServiceImpl extends ServiceImpl<TpatientMapper, Tpatient> implements TpatientService {

}
