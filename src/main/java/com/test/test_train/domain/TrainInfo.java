package com.test.test_train.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

/**
 * 
 * @TableName train_info
 */
@TableName(value ="train_info")
@Data
public class TrainInfo implements Serializable {
    /**
     * 车次（Z100）
     */
    @TableId
    @TableField("t_id")
    private String tId;

    /**
     * 车的类型
     */
    private String tType;

    /**
     * 始发站
     */
    private String tStartStation;

    /**
     * 终点站
     */
    private String tEndStation;

    /**
     * 始发时间
     */

    private String tStarttime;

    /**
     * 到达时间
     */

    private String tEndtime;

    /**
     * 到达日期
     */
    private String tArrivalTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}