package com.test.test_train.service;

import com.test.test_train.domain.UserInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 周天龙
* @description 针对表【user_info】的数据库操作Service
* @createDate 2022-07-25 14:30:54
*/
public interface UserInfoService extends IService<UserInfo> {
    public UserInfo getUserInfoByNameByPass(UserInfo userInfo);

    public int saveUserInfo(UserInfo userInfo);

    public int getUserByName(String uName);
}
