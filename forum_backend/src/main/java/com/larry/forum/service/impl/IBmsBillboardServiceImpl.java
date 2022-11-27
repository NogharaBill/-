package com.larry.forum.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.larry.forum.mapper.BmsBillboardMapper;
import com.larry.forum.model.entity.BmsBillboard;
import com.larry.forum.service.IBmsBillboardService;
import org.springframework.stereotype.Service;

@Service
public class IBmsBillboardServiceImpl extends ServiceImpl<BmsBillboardMapper
        , BmsBillboard> implements IBmsBillboardService{

}