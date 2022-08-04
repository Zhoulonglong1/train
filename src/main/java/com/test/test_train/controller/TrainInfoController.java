package com.test.test_train.controller;

import com.test.test_train.domain.TrainInfo;
import com.test.test_train.service.TrainInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/TrainInfoController")
public class TrainInfoController {

    @Autowired
    private TrainInfoService trainInfoService;

    @PostMapping("/showAllTrainInfo")
    public List<TrainInfo> showAllTrainInfo(){
        return trainInfoService.showAllTrainInfo();
    }

    @PostMapping("/showAllById")
    public List<TrainInfo> showAllById(@RequestBody TrainInfo trainInfo){
        return trainInfoService.showAllById(trainInfo.getTId());
    }

    @PostMapping("/showAllByName")
    public List<TrainInfo> showAllByName(@RequestBody TrainInfo trainInfo){
        return trainInfoService.showAllByName(trainInfo.getTStartStation(),trainInfo.getTEndStation());
    }
}
