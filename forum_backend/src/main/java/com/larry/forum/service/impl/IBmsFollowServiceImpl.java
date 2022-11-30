package com.larry.forum.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.larry.forum.mapper.BmsFollowMapper;
import com.larry.forum.model.entity.BmsFollow;
import com.larry.forum.service.IBmsFollowService;
import org.springframework.stereotype.Service;

@Service
public class IBmsFollowServiceImpl extends ServiceImpl<BmsFollowMapper, BmsFollow> implements IBmsFollowService {

}
