package com.jk.controller.order;

import com.alibaba.fastjson.JSON;
import com.jk.model.housePropertyCollection.OrderHouseUser;
import com.jk.model.housePropertyCollection.SellHouseResource;
import com.jk.service.order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("addOrderList")
    @ResponseBody
    public Object addOrderList(String s){

        OrderHouseUser orderHouseUser = JSON.parseObject(s, OrderHouseUser.class);
        boolean n = orderService.addOrderList(orderHouseUser);
        return n;
    }
}
