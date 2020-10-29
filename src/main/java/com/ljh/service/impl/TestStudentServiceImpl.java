package com.ljh.service.impl;

import com.ljh.bean.TestStudent;
import com.ljh.daoMz.TestStudentMapper;
import com.ljh.service.TestStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 学生信息表 服务实现类
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
@Service
public class TestStudentServiceImpl extends ServiceImpl<TestStudentMapper, TestStudent> implements TestStudentService {

}
