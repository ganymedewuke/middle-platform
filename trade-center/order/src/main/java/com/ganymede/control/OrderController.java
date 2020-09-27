package com.ganymede.control;

import com.ganymede.entity.Order;
import com.ganymede.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("hello")
    public String hello(String name) {
        return name;
    }

    @RequestMapping("toInsertOrder")
    public String toInsertOrder(){
        return "toInsertOrder";
    }


    @RequestMapping("insertOrder")
    public String insertOrder(Order order, Model model){
        orderService.insertOrderInfo(order);
        return "success";
    }

}
