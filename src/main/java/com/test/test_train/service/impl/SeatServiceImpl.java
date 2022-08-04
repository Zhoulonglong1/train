package com.test.test_train.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.test.test_train.domain.Seat;
import com.test.test_train.service.SeatService;
import com.test.test_train.mapper.SeatMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author 周天龙
* @description 针对表【seat】的数据库操作Service实现
* @createDate 2022-08-01 16:33:38
*/
@Service
public class SeatServiceImpl extends ServiceImpl<SeatMapper, Seat>
    implements SeatService{

    @Autowired
    private SeatMapper seatMapper;
    @Override
    public List<Seat> searchSeat(String t_id) {
        return seatMapper.searchSeat(t_id);
    }
}




