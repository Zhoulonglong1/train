package com.test.test_train.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.test.test_train.domain.UserInfo;
import com.test.test_train.service.UserInfoService;
import com.test.test_train.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author 周天龙
* @description 针对表【user_info】的数据库操作Service实现
* @createDate 2022-07-25 14:30:54
*/
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo>
    implements UserInfoService{

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo getUserInfoByNameByPass(UserInfo userInfo){
        return userInfoMapper.getUserInfoByNameByPass(userInfo);
    }

    @Override
    public int saveUserInfo(UserInfo userInfo) {
        return userInfoMapper.saveUserInfo(userInfo);
    }

    @Override
    public int getUserByName(String uName) {
        return userInfoMapper.getUserByName(uName);
    }

}




