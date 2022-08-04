package com.test.test_train.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName user_info
 */
@TableName(value ="user_info")
@Data
public class UserInfo implements Serializable {
    /**
     * 用户编号
     */
    @TableId
    private String userId;

    /**
     * 用户名
     */
    @TableField("u_name")
    private String uName;

    /**
     * 用户密码
     */
    @TableField("u_password")
    private String uPassword;

    /**
     * 用户类型 0是用户，1是管理员
     */
    @TableField("u_type")
    private Integer uType;

    /**
     * 用户电话
     */
    @TableField("u_phone")
    private String uPhone;

    /**
     * 用户邮箱
     */
    @TableField("u_email")
    private String uEmail;

    /**
     * 用户真实姓名
     */
    @TableField("u_realname")
    private String uRealname;

    /**
     * 用户性别（1：男   0：女）
     */
    @TableField("u_gender")
    private Integer uGender;

    /**
     * 用户地址
     */
    @TableField("u_adress")
    private String uAdress;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}