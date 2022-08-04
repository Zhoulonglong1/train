package com.test.test_train.service;

import com.test.test_train.domain.Passenger;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author 周天龙
* @description 针对表【passenger】的数据库操作Service
* @createDate 2022-08-03 16:11:15
*/
public interface PassengerService extends IService<Passenger> {
    public int insertPassenger(Passenger passenger);

    public List<Passenger> selectAllByUPhone(String uPhone);

    public int deleteByPassengerPhoneNumber(String passengerPhoneNumber);

    public int selectAllByPassengerPhoneNumber(String passengerPhoneNumber);

    public int selectAllByPassengerIdNumber(String passengerIdNumber);
}
