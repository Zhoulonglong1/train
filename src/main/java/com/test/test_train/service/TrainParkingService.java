package com.test.test_train.service;

import com.test.test_train.domain.TrainParking;
import com.baomidou.mybatisplus.extension.service.IService;
import com.test.test_train.domain.TrainScheduleInfo;
import com.test.test_train.domain.TrainTransferSchedule;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
* @author 周天龙
* @description 针对表【train_parking】的数据库操作Service
* @createDate 2022-08-01 16:33:38
*/
public interface TrainParkingService extends IService<TrainParking> {

    public List<TrainTransferSchedule> GetTrainScheduleInfoList(String train_start_station, String train_end_station);

    public List<TrainScheduleInfo>  searchTrainSchedule(String train_start_station, String train_end_station);
}
