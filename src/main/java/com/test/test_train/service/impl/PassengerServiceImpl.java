package com.test.test_train.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.test.test_train.domain.Passenger;
import com.test.test_train.service.PassengerService;
import com.test.test_train.mapper.PassengerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author 周天龙
* @description 针对表【passenger】的数据库操作Service实现
* @createDate 2022-08-03 16:11:15
*/
@Service
public class PassengerServiceImpl extends ServiceImpl<PassengerMapper, Passenger>
    implements PassengerService{

    @Autowired
    private PassengerMapper passengerMapper;

    @Override
    public int insertPassenger(Passenger passenger) {
        return passengerMapper.insertPassenger(passenger);
    }

    @Override
    public List<Passenger> selectAllByUPhone(String uPhone) {
        return passengerMapper.selectAllByUPhone(uPhone);
    }

    @Override
    public int deleteByPassengerPhoneNumber(String passengerPhoneNumber) {
        return passengerMapper.deleteByPassengerPhoneNumber(passengerPhoneNumber);
    }

    @Override
    public int selectAllByPassengerPhoneNumber(String passengerPhoneNumber) {
        return passengerMapper.selectAllByPassengerPhoneNumber(passengerPhoneNumber);
    }

    @Override
    public int selectAllByPassengerIdNumber(String passengerIdNumber) {
        return passengerMapper.selectAllByPassengerIdNumber(passengerIdNumber);
    }
}




