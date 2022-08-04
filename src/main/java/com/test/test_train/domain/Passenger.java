package com.test.test_train.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName passenger
 */
@TableName(value ="passenger")
@Data
public class Passenger implements Serializable {
    /**
     * 乘客的手机号
     */
    @TableId
    private String passengerPhoneNumber;

    /**
     * 当前用户的手机号
     */
    private String uPhone;

    /**
     * 乘客的真实姓名
     */
    private String passengerRealName;

    /**
     * 乘客的身份证号
     */
    private String passengerIdNumber;

    /**
     * 用户类型
     */
    private String passengerType;

    /**
     * 用户地址
     */
    private String passengerAddress;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    public String getuPhone() {
        return uPhone;
    }

    public void setuPhone(String uPhone) {
        this.uPhone = uPhone;
    }

}