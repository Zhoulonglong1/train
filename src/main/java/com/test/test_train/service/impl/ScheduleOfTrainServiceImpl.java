package com.test.test_train.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.test.test_train.domain.ScheduleOfTrain;
import com.test.test_train.service.ScheduleOfTrainService;
import com.test.test_train.mapper.ScheduleOfTrainMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author 周天龙
* @description 针对表【schedule_of_train】的数据库操作Service实现
* @createDate 2022-08-02 16:02:27
*/
@Service
public class ScheduleOfTrainServiceImpl extends ServiceImpl<ScheduleOfTrainMapper, ScheduleOfTrain>
    implements ScheduleOfTrainService{

    @Autowired
    private ScheduleOfTrainMapper scheduleOfTrainMapper;
    @Override
    public List<ScheduleOfTrain> searchMoney(String t_id) {
        return scheduleOfTrainMapper.searchMoney(t_id);
    }
}




