package com.test.test_train.mapper;

import com.test.test_train.domain.TrainParkingStation;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
* @author 周天龙
* @description 针对表【train_parking_station】的数据库操作Mapper
* @createDate 2022-07-25 14:30:54
* @Entity com.test.test_train.domain.TrainParkingStation
*/
@Mapper
public interface TrainParkingStationMapper extends BaseMapper<TrainParkingStation> {

    @Select(" select * from test_train.train_parking_station ")
    public List<TrainParkingStation> selectAll();

    @Select(" select * from test_train.train_parking_station where t_id = #{tId}")
    public List<TrainParkingStation> selectAllById(String tId);
}




