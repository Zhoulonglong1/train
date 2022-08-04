package com.test.test_train.mapper;

import com.test.test_train.domain.OrderList;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 周天龙
* @description 针对表【order_list】的数据库操作Mapper
* @createDate 2022-08-04 21:28:56
* @Entity com.test.test_train.domain.OrderList
*/
@Mapper
public interface OrderListMapper extends BaseMapper<OrderList> {


}




