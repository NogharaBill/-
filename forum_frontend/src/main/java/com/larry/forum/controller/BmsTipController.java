package com.larry.forum.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.larry.forum.common.api.ApiResult;
import com.larry.forum.model.entity.BmsBillboard;
import com.larry.forum.model.entity.BmsTip;
import com.larry.forum.service.IBmsBillboardService;
import com.larry.forum.service.IBmsTipService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/tip")
public class BmsTipController extends BaseController{

    @Resource
    private IBmsTipService bmsTipService;

    @GetMapping("/today")
    public ApiResult<BmsTip> getRandomTip(){
        BmsTip tip = bmsTipService.getRandomTip();
        return ApiResult.success(tip);
    }

}
