package com.larry.forum.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.larry.forum.model.entity.BmsTip;
import org.springframework.stereotype.Repository;

@Repository
public interface BmsTipMapper extends BaseMapper<BmsTip> {
    BmsTip getRandomTip();

}
