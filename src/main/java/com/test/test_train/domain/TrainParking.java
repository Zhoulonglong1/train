package com.test.test_train.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName train_parking
 */
@TableName(value ="train_parking")
@Data
public class TrainParking implements Serializable {
    /**
     * 
     */
    @TableField("t_id")
    private String tId;

    /**
     * 
     */
    @TableField("arrive_day_type")
    private String arriveDayType;

    /**
     * 
     */
    @TableField("arrive_time")
    private String arriveTime;

    /**
     * 
     */
    @TableField("start_time")
    private String startTime;

    /**
     * 
     */
    @TableField("running_time")
    private String runningTime;

    /**
     * 
     */
    @TableField("station_no")
    private String stationNo;

    /**
     * 
     */
    @TableField("station_name")
    private String stationName;



    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}