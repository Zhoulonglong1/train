package com.test.test_train.mapper;

import com.test.test_train.domain.Passenger;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
* @author 周天龙
* @description 针对表【passenger】的数据库操作Mapper
* @createDate 2022-08-03 16:11:15
* @Entity com.test.test_train.domain.Passenger
*/
@Mapper
public interface PassengerMapper extends BaseMapper<Passenger> {
   @Insert(" insert into test_train.passenger(u_phone, passenger_phone_number, passenger_real_name, passenger_id_number, passenger_type, passenger_address) " +
           "VALUES (#{uPhone},#{passengerPhoneNumber},#{passengerRealName},#{passengerIdNumber},#{passengerType},#{passengerAddress})")
    public int insertPassenger( Passenger passenger);


   @Select(" select * from test_train.passenger where u_phone = #{uPhone}")
   public List<Passenger> selectAllByUPhone(String uPhone);

   @Delete(" delete from test_train.passenger where passenger_phone_number = #{passengerPhoneNumber}")
   public int deleteByPassengerPhoneNumber(String passengerPhoneNumber);

   @Select(" select count(*) from test_train.passenger where passenger_phone_number = #{passengerPhoneNumber}")
   public int selectAllByPassengerPhoneNumber(String passengerPhoneNumber);

   @Select(" select count(*) from test_train.passenger where passenger_id_number = #{passengerIdNumber}")
   public int selectAllByPassengerIdNumber(String passengerIdNumber);
}




