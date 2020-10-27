package com.ljh.service.impl;

import com.ljh.bean.REmployee;
import com.ljh.mapper.REmployeeMapper;
import com.ljh.service.REmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 员工代码表(R_Employee) 服务实现类
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
@Service
public class REmployeeServiceImpl extends ServiceImpl<REmployeeMapper, REmployee> implements REmployeeService {

}
