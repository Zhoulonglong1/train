package com.test.test_train.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName seat
 */
@TableName(value ="seat")
@Data
public class Seat implements Serializable {
    /**
     * 车次，如K200
     */
    private String tId;

    /**
     * 车厢号：1-8
     */
    private String carriageNo;

    /**
     * 座位类型
     */
    private String seatType;

    /**
     * 座位数量
     */
    private Integer seatCount;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}