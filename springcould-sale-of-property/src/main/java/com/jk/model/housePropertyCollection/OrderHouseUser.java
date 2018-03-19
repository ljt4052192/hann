package com.jk.model.housePropertyCollection;

import java.io.Serializable;
import java.util.Date;

public class OrderHouseUser implements Serializable{

    private String id;

    /**
     * 房源ID
     */
    private String hid;

    /**
     * 用户ID
     */
    private String eid;

    /**
     * 预约次数
     */
    private Integer ordernumber;

    /**
     * 预约时间
     */
    private Date ordertime;

    /**
     * 用户姓名
     * @return
     */
    private String customername;

    /**
     * 用户手机号
     * @return
     */
    private String customerphone;

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getCustomerphone() {
        return customerphone;
    }

    public void setCustomerphone(String customerphone) {
        this.customerphone = customerphone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHid() {
        return hid;
    }

    public void setHid(String hid) {
        this.hid = hid;
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public Integer getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(Integer ordernumber) {
        this.ordernumber = ordernumber;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    @Override
    public String toString() {
        return "OrderHouseUser{" +
                "id='" + id + '\'' +
                ", hid='" + hid + '\'' +
                ", eid='" + eid + '\'' +
                ", ordernumber=" + ordernumber +
                ", ordertime=" + ordertime +
                ", customername='" + customername + '\'' +
                ", customerphone='" + customerphone + '\'' +
                '}';
    }
}
