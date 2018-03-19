package com.jk.service.order;

import com.jk.mapper.order.OrderMapper;
import com.jk.model.housePropertyCollection.OrderHouseUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public boolean addOrderList(OrderHouseUser orderHouseUser) {
        return orderMapper.addOrderList(orderHouseUser);
    }
}
