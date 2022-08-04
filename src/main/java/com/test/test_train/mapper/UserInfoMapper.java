package com.test.test_train.mapper;

import com.test.test_train.domain.UserInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
* @author 周天龙
* @description 针对表【user_info】的数据库操作Mapper
* @createDate 2022-07-25 14:30:54
* @Entity com.test.test_train.domain.UserInfo
*/

@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfo> {

    @Select("select * from test_train.user_info where u_name =#{uName} and u_password = #{uPassword}")
    public UserInfo getUserInfoByNameByPass(UserInfo userInfo);

    @Insert(" insert into test_train.user_info( u_name, u_password,u_phone, u_email, u_realname,u_gender ,u_adress)" +
            " values(#{uName},#{uPassword},#{uPhone},#{uEmail},#{uRealname},#{uGender},#{uAdress})  ")
    public int saveUserInfo(UserInfo userInfo);

    @Select(" select count(*) from test_train.user_info where u_name =#{uName}")
    public int getUserByName(String uName);
}




