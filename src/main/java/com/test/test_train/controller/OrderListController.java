package com.test.test_train.controller;

import com.test.test_train.domain.OrderList;
import com.test.test_train.service.OrderListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/OrderListController")
public class OrderListController {

    @Autowired
    private OrderListService orderListService;
    @PostMapping("/AddOrder")
    public Integer addOrder( @RequestBody  OrderList orderList){
        return orderListService.addOrder(orderList);
    }

    @PostMapping("/SelectAllOrder")
    public List<OrderList> selectAllOrder(){
        return orderListService.list();
    }

}
