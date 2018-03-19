package com.jk.mapper.order;

import com.jk.model.housePropertyCollection.OrderHouseUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface OrderMapper {

    @Insert("INSERT INTO \n" +
            "t_order_house_user(id,hid,eid,ordernumber,ordertime) \n" +
            "VALUES \n" +
            "(#{id},#{hid},#{eid},#{ordernumber},#{ordertime})")
    boolean addOrderList(OrderHouseUser orderHouseUser);
}
