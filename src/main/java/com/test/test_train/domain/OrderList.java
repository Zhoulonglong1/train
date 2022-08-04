package com.test.test_train.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName order_list
 */
@TableName(value ="order_list")
@Data
public class OrderList implements Serializable {
    /**
     * 订单编号
     */
    @TableId(type = IdType.AUTO)
    private Integer orderId;

    /**
     * 用户电话号码
     */
    private String userPhoneNumber;

    /**
     * 乘客手机号
     */
    private String passengerPhoneNumber;

    /**
     * 乘客身份证号
     */
    private String passengerIdNumber;

    /**
     * 车次
     */
    private String tId;



    /**
     * 出发站名
     */
    private String startStationName;




    /**
     * 结束站名
     */
    private String endStationName;

    /**
     * 车厢号
     */
    private String carriageNo;

    /**
     * 座位编号
     */
    private String seatNo;

    /**
     * 订单钱
     */
    private String orderMoney;

    /**
     * 订单创建时间
     */
    private Date orderCreateTime;

    /**
     * 订单状态
     */
    private String orderStatus;

    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId;
    }

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}