package com.test.test_train.service;

import com.test.test_train.domain.ScheduleOfTrain;
import com.baomidou.mybatisplus.extension.service.IService;
import com.test.test_train.mapper.ScheduleOfTrainMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
* @author 周天龙
* @description 针对表【schedule_of_train】的数据库操作Service
* @createDate 2022-08-02 16:02:27
*/
public interface ScheduleOfTrainService extends IService<ScheduleOfTrain> {

    public List<ScheduleOfTrain> searchMoney (String t_id);
}
