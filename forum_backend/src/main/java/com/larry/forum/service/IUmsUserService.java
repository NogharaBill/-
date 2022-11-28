package com.larry.forum.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.larry.forum.model.dto.RegisterDTO;
import com.larry.forum.model.entity.UmsUser;

public interface IUmsUserService extends IService<UmsUser> {
    /*注册功能*/
    UmsUser executeRegister(RegisterDTO dto);



}
