package com.ganymede.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Order {
    private long id;
    private double amount;
    private long userId;
    private long productId;
    private long merchantId;
    private Date createTime;
    private Date updateTime;
    private Date payTime;
    private int payStatus;
    private String address;
    private String telephone;
    private String userName;
    private String tradeNumber;
    private String payType;
    private int payNumber;
    private int ordersStatus;
}
