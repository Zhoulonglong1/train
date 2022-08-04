package com.test.test_train.controller;

import com.test.test_train.domain.Passenger;
import com.test.test_train.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/PassengerController")
public class PassengerController {
    @Autowired
    private PassengerService passengerService;

    @PostMapping("/InsertPassenger")
    public int insertPassenger(@RequestBody Passenger passenger){
        System.out.println(passenger.getPassengerIdNumber());
        return passengerService.insertPassenger(passenger);
    }
    @PostMapping("/SelectAllByUPhone")
    public List<Passenger> selectAllByUPhone(@RequestParam String uPhone){
        return passengerService.selectAllByUPhone(uPhone);
    }
    @PostMapping("/DeleteByPassengerPhoneNumber")
    public int deleteByPassengerPhoneNumber(String passengerPhoneNumber){
        return passengerService.deleteByPassengerPhoneNumber(passengerPhoneNumber);
    }

    @PostMapping("/SelectAllByPassengerPhoneNumber")
    public int selectAllByPassengerPhoneNumber(@RequestBody Passenger passenger){
        return passengerService.selectAllByPassengerPhoneNumber(passenger.getPassengerPhoneNumber());
    }

    @PostMapping("/SelectAllByPassengerIdNumber")
    public int selectAllByPassengerIdNumber(@RequestBody Passenger passenger){
        return passengerService.selectAllByPassengerIdNumber(passenger.getPassengerIdNumber());
    }
}
