package com.test.test_train.controller;

import com.test.test_train.domain.ScheduleOfTrain;
import com.test.test_train.service.ScheduleOfTrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ScheduleOfTrainController")
public class ScheduleOfTrainController {
    @Autowired
    private ScheduleOfTrainService scheduleOfTrainService;

    @PostMapping("/SearchMoney")
    public List<ScheduleOfTrain> searchMoney (@RequestParam String trainNumber){
        return scheduleOfTrainService.searchMoney(trainNumber);
    }
}
