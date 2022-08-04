package com.test.test_train.mapper;

import com.test.test_train.domain.Seat;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
* @author 周天龙
* @description 针对表【seat】的数据库操作Mapper
* @createDate 2022-08-01 16:33:37
* @Entity com.test.test_train.domain.Seat
*/
@Mapper
public interface SeatMapper extends BaseMapper<Seat> {

    @Select("select * from test_train.seat where t_id = #{t_id}")
    public List<Seat> searchSeat (String t_id);
}




