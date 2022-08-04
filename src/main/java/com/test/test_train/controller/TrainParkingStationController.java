package com.test.test_train.controller;

import com.test.test_train.domain.TrainParkingStation;
import com.test.test_train.service.TrainParkingStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/TrainParkingStationController")
public class TrainParkingStationController {
    @Autowired
    private TrainParkingStationService trainParkingStationService;

    @PostMapping("/selectAll")
    public List<TrainParkingStation> selectAll(){
        return trainParkingStationService.selectAll();
    }
    @PostMapping("/selectAllById")
    public List<TrainParkingStation> selectAllById(@RequestBody TrainParkingStation trainParkingStation){
        return trainParkingStationService.selectAllById(trainParkingStation.getTId());
    }

}
