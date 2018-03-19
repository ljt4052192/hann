package com.jk.service.order;

import com.jk.model.housePropertyCollection.OrderHouseUser;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;

public interface OrderService {

    boolean addOrderList(OrderHouseUser orderHouseUser);
}
