package com.mall.dao;

import com.mall.pojo.Order;
import com.mall.pojo.OrderItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderItemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderItem record);

    int insertSelective(OrderItem record);

    OrderItem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderItem record);

    int updateByPrimaryKey(OrderItem record);

    List<OrderItem> getByOrderNoUserId(@Param("orderNo")Long orderNo,
                                       @Param("orderNo")Integer userId);

    List<OrderItem> getByOrderNo(@Param("orderNo")Long orderNo);


    /* 批量insert */
    void batchInsert(@Param("orderItemList") List<OrderItem> orderItemList);





}