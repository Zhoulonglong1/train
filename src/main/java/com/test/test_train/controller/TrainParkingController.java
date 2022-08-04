package com.test.test_train.controller;

import com.test.test_train.domain.TrainScheduleInfo;
import com.test.test_train.domain.TrainTransferSchedule;
import com.test.test_train.service.TrainParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/TrainParkingController")
public class TrainParkingController {
    @Autowired
    private TrainParkingService trainParkingService;

    @PostMapping("/GetTrainScheduleInfoList")
    public List<TrainTransferSchedule> GetTrainScheduleInfoList(@RequestParam String train_start_station, String train_end_station){
        System.out.println(train_end_station);
        return trainParkingService.GetTrainScheduleInfoList(train_start_station,train_end_station);
    }

    @PostMapping("/SearchTrainSchedule")
    public List<TrainScheduleInfo>  searchTrainSchedule(@RequestParam String train_start_station, String train_end_station){
        return trainParkingService.searchTrainSchedule(train_start_station, train_end_station);
    }

}
