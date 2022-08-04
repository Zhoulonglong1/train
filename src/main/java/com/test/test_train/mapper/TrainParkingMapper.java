package com.test.test_train.mapper;

import com.test.test_train.domain.TrainParking;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.test.test_train.domain.TrainScheduleInfo;
import com.test.test_train.domain.TrainTransferSchedule;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
* @author 周天龙
* @description 针对表【train_parking】的数据库操作Mapper
* @createDate 2022-08-01 16:33:38
* @Entity com.test.test_train.domain.TrainParking
*/
@Mapper
public interface TrainParkingMapper extends BaseMapper<TrainParking> {

    @Select("select A.t_id as train_number_1,D.t_id as train_number_2, A.station_no as start_station_no,A.station_name as start_station_name," +
            "            B.station_no as transfer_station_no_1 , B.station_name as transfer_station_name ,C.station_no as transfer_station_no_2,A.start_time as start_time_1," +
            "            B.arrive_time as arrive_time_1 , C.start_time as start_time_2 ,D.arrive_time as arrive_time_2," +
            "            D.station_no as end_station_no, D.station_name as end_station_name, A.running_time as start_running_time_1," +
            "            B.running_time as end_running_time_1 ,C.running_time as start_running_time_2, D.running_time as end_running_time_2" +
            "            from test_train.train_parking as A , test_train.train_parking as B , test_train.train_parking as C ,test_train.train_parking as D " +
            "            where A.station_name = #{train_start_station} and D.station_name = #{train_end_station} and " +
            "            A.t_id = B.t_id and B.station_name = C.station_name " +
            "            and C.t_id = D.t_id and B.t_id <> C.t_id   and " +
            "            B.arrive_time < C.arrive_time and A.station_no <B.station_no and C.station_no<D.station_no")
    public List<TrainTransferSchedule> GetTrainScheduleInfoList(String train_start_station, String train_end_station);

    @Select("select C.t_id as train_number , " +
            "            C.station_name as start_station ,D.station_name as end_station ," +
            "            C.station_no as start_no , D.station_no as  end_no  ," +
            "            C.start_time as start_time , D.arrive_time as arrive_time," +
            "            C.running_time as start_running_time ,D.running_time as end_running_time " +
            "            from test_train.train_parking as C ,test_train.train_parking as D " +
            "            where C.t_id = D.t_id" +
            "            and C.station_name = #{train_start_station} and D.station_name = #{train_end_station}" +
            "            and C.t_id in (select A.t_id from " +
            "            test_train.train_parking as A ,test_train.train_parking as B" +
            "            where  A.t_id = B.t_id and " +
            "            A.station_name = #{train_start_station} and " +
            "            B.station_name = #{train_end_station} " +
            "            and A.station_no <B.station_no)")
    public List<TrainScheduleInfo>  searchTrainSchedule(String train_start_station, String train_end_station);
}




