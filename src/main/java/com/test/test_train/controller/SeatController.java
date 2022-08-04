package com.test.test_train.controller;

import com.test.test_train.domain.Seat;
import com.test.test_train.domain.TrainParking;
import com.test.test_train.domain.TrainTransferSchedule;
import com.test.test_train.service.SeatService;
import com.test.test_train.service.TrainInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/SeatController")
public class SeatController {
    @Autowired
    private SeatService seatService;

    //找座位
    @PostMapping("/SearchSeat")
    public List<Seat> searchSeat (@RequestParam String trainNumber){
//        System.out.println(trainTransferSchedule);
        return seatService.searchSeat(trainNumber);
    }

}
