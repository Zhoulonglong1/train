package com.test.test_train.mapper;

import com.test.test_train.domain.ScheduleOfTrain;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.test.test_train.domain.Seat;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
* @author 周天龙
* @description 针对表【schedule_of_train】的数据库操作Mapper
* @createDate 2022-08-02 16:02:27
* @Entity com.test.test_train.domain.ScheduleOfTrain
*/
@Mapper
public interface ScheduleOfTrainMapper extends BaseMapper<ScheduleOfTrain> {

    @Select("select * from test_train.schedule_of_train where t_id = #{t_id}")
    public List<ScheduleOfTrain> searchMoney (String t_id);
}




