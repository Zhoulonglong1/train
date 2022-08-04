package com.test.test_train.service;

import com.test.test_train.domain.TrainInfo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author 周天龙
* @description 针对表【train_info】的数据库操作Service
* @createDate 2022-07-25 14:30:54
*/
public interface TrainInfoService extends IService<TrainInfo> {
    public List<TrainInfo> showAllTrainInfo();

    public List<TrainInfo> showAllById(String tId);

    List<TrainInfo> showAllByName(String tStartStation, String tEndStation);
}
