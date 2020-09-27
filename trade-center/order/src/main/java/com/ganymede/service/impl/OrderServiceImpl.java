package com.ganymede.service.impl;

import com.ganymede.dao.OrderDao;
import com.ganymede.entity.Order;
import com.ganymede.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Override
    public void insertOrderInfo(Order order) {
        orderDao.insertOrderInfo(order);
    }
}
