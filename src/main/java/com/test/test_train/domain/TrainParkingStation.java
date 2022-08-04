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
 * @TableName train_parking_station
 */
@TableName(value ="train_parking_station")
@Data
public class TrainParkingStation implements Serializable {
    /**
     * 
     */
    private String tId;

    /**
     * 
     */
    private String sname1;

    /**
     * 
     */
    private String stime1;

    /**
     * 
     */
    private String sname2;

    /**
     * 
     */
    private String stime2;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}