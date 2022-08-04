package com.test.test_train.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.test.test_train.domain.TrainParking;
import com.test.test_train.domain.TrainScheduleInfo;
import com.test.test_train.domain.TrainTransferSchedule;
import com.test.test_train.service.TrainParkingService;
import com.test.test_train.mapper.TrainParkingMapper;
import com.test.test_train.util.TimeCaculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
* @author 周天龙
* @description 针对表【train_parking】的数据库操作Service实现
* @createDate 2022-08-01 16:33:38
*/
@Service
public class TrainParkingServiceImpl extends ServiceImpl<TrainParkingMapper, TrainParking>
    implements TrainParkingService{

    @Autowired
    private TrainParkingMapper trainParkingMapper;

    @Override
    public List<TrainTransferSchedule> GetTrainScheduleInfoList(String train_start_station, String train_end_station) {
        List<TrainTransferSchedule> trainTransferSchedules = trainParkingMapper.GetTrainScheduleInfoList(train_start_station, train_end_station);
        List<TrainTransferSchedule> result = trainTransferSchedules.stream().map(trainTransferSchedule -> {
            trainTransferSchedule.setParkingTime(TimeCaculator.jianTime(trainTransferSchedule.getStart_time_2(), trainTransferSchedule.getArrive_time_1()));
            trainTransferSchedule.setAllParkingTime(TimeCaculator.jianTime(trainTransferSchedule.getArrive_time_2(), trainTransferSchedule.getStart_time_1()));
            return trainTransferSchedule;
        }).collect(Collectors.toList());
        return result;
    }

    @Override
    public List<TrainScheduleInfo> searchTrainSchedule(String train_start_station, String train_end_station) {
       return trainParkingMapper.searchTrainSchedule(train_start_station, train_end_station);

    }
}




