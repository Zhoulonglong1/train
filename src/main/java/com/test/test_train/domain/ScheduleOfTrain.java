package com.test.test_train.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName schedule_of_train
 */
@TableName(value ="schedule_of_train")
@Data
public class ScheduleOfTrain implements Serializable {
    /**
     * 编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 车次K100
     */
    private String tId;

    /**
     * 始发站
     */
    private String departureStation;

    /**
     * 终点站
     */
    private String endStation;

    /**
     * 出发站
     */
    private String fromStation;

    /**
     * 到达站
     */
    private String toStation;

    /**
     * 出发时间
     */
    private String departureTime;

    /**
     * 到达时间
     */
    private String arrivalTime;

    /**
     * 历时
     */
    private String useTime;

    /**
     * 软卧
     */
    private String softBed;

    /**
     * 硬卧
     */
    private String hardBed;

    /**
     * 一等座
     */
    private String firstClassSeat;

    /**
     * 二等座
     */
    private String secondClassSeat;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}