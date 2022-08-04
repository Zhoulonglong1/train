package com.test.test_train.mapper;

import com.test.test_train.domain.TrainInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
* @author 周天龙
* @description 针对表【train_info】的数据库操作Mapper
* @createDate 2022-07-25 14:30:54
* @Entity com.test.test_train.domain.TrainInfo
*/
@Mapper
public interface TrainInfoMapper extends BaseMapper<TrainInfo> {

    @Select(" select * from test_train.train_info ")
    public List<TrainInfo> showAllTrainInfo();

    @Select("select * from test_train.train_info where t_id = #{tId} ")
    public List<TrainInfo> showAllById(String tId);

    @Select("select * from test_train.train_info where t_start_station = #{tStartStation} and t_end_station = #{tEndStation}")
    public List<TrainInfo> showAllByName(String tStartStation,String tEndStation);
}




