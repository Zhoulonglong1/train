package com.test.test_train.service;

import com.test.test_train.domain.OrderList;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 周天龙
* @description 针对表【order_list】的数据库操作Service
* @createDate 2022-08-04 21:28:56
*/
public interface OrderListService extends IService<OrderList> {

    public Integer addOrder(OrderList orderList);
}
