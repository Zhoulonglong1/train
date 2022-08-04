package com.test.test_train.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.test.test_train.domain.OrderList;
import com.test.test_train.service.OrderListService;
import com.test.test_train.mapper.OrderListMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
* @author 周天龙
* @description 针对表【order_list】的数据库操作Service实现
* @createDate 2022-08-04 21:28:56
*/
@Service
public class OrderListServiceImpl extends ServiceImpl<OrderListMapper, OrderList>
    implements OrderListService{

    @Autowired
    private OrderListMapper orderListMapper;

    public Integer addOrder(OrderList orderList){
        orderList.setOrderCreateTime(new Date());
        return orderListMapper.insert(orderList);
    }


}




