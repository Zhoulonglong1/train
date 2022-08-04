package com.test.test_train.controller;

import com.test.test_train.domain.UserInfo;
import com.test.test_train.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/UserInfoController")
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;

    @PostMapping("/getUserInfoByNameByPass")
    public UserInfo getUserInfoByNameByPass(@RequestBody UserInfo userInfo) throws Exception{
        return userInfoService.getUserInfoByNameByPass(userInfo);
    }

    @PostMapping("/saveUserInfo")
    public int saveUserInfo(@RequestBody UserInfo userInfo) throws Exception{
        return userInfoService.saveUserInfo(userInfo);
    }

    @PostMapping("/getUserByName")
    public int getUserByName(@RequestBody UserInfo userInfo) throws Exception{
        return userInfoService.getUserByName(userInfo.getUName());
    }
}
