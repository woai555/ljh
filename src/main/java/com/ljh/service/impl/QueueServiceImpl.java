package com.ljh.service.impl;

import com.ljh.bean.Queue;
import com.ljh.mapper.QueueMapper;
import com.ljh.service.QueueService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 队列表 服务实现类
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
@Service
public class QueueServiceImpl extends ServiceImpl<QueueMapper, Queue> implements QueueService {

}
