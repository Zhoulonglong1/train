package com.test.test_train.service;

import com.test.test_train.domain.Seat;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author 周天龙
* @description 针对表【seat】的数据库操作Service
* @createDate 2022-08-01 16:33:38
*/
public interface SeatService extends IService<Seat> {

    public List<Seat> searchSeat (String t_id);
}
