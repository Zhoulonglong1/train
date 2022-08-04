package com.test.test_train.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.test.test_train.domain.TrainParkingStation;
import com.test.test_train.service.TrainParkingStationService;
import com.test.test_train.mapper.TrainParkingStationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author 周天龙
* @description 针对表【train_parking_station】的数据库操作Service实现
* @createDate 2022-07-25 14:30:54
*/
@Service
public class TrainParkingStationServiceImpl extends ServiceImpl<TrainParkingStationMapper, TrainParkingStation>
    implements TrainParkingStationService{

    @Autowired
    private TrainParkingStationMapper trainParkingStationMapper;

    @Override
    public List<TrainParkingStation> selectAll() {
        return trainParkingStationMapper.selectAll();
    }

    @Override
    public List<TrainParkingStation> selectAllById(String tId) {
        return trainParkingStationMapper.selectAllById(tId);
    }
}




