package com.test.test_train.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.test.test_train.domain.TrainInfo;
import com.test.test_train.service.TrainInfoService;
import com.test.test_train.mapper.TrainInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author 周天龙
* @description 针对表【train_info】的数据库操作Service实现
* @createDate 2022-07-25 14:30:54
*/
@Service
public class TrainInfoServiceImpl extends ServiceImpl<TrainInfoMapper, TrainInfo>
    implements TrainInfoService{

    @Autowired
    private TrainInfoMapper trainInfoMapper;

    @Override
    public List<TrainInfo> showAllTrainInfo() {
        return trainInfoMapper.showAllTrainInfo();
    }

    @Override
    public List<TrainInfo> showAllById(String tId) {
        return trainInfoMapper.showAllById(tId);
    }

    @Override
    public List<TrainInfo> showAllByName(String tStartStation, String tEndStation) {
        return trainInfoMapper.showAllByName(tStartStation, tEndStation);
    }
}




