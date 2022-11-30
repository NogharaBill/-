package com.larry.forum.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.larry.forum.model.dto.RegisterDTO;
import com.larry.forum.model.entity.UmsUser;
import com.larry.forum.model.dto.LoginDTO;
import com.larry.forum.model.vo.ProfileVO;

public interface IUmsUserService extends IService<UmsUser> {
    /*注册功能*/
    UmsUser executeRegister(RegisterDTO dto);
    /*登录功能*/
    UmsUser getUserByUsername(String username);
    String executeLogin(LoginDTO dto);
    ProfileVO getUserProfile(String id);

}
