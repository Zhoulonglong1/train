package com.test.test_train.service;

import com.test.test_train.domain.TrainParkingStation;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author 周天龙
* @description 针对表【train_parking_station】的数据库操作Service
* @createDate 2022-07-25 14:30:54
*/
public interface TrainParkingStationService extends IService<TrainParkingStation> {

    public List<TrainParkingStation> selectAll();

    public List<TrainParkingStation> selectAllById(String tId);

}
