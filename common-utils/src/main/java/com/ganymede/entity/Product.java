package com.ganymede.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Product {
    private long id;
    private long productTypeId;
    private String productName;
    private String productTitle;
    private double productPrice;
    private long merchantId;
    private Date creatTime;
    private Date updateTime;
    private Date approveTime;
    private int approveStatus; //0 未审核， 1 审核通过，  2 审核不通过
    private long nums;
    private long sellNums;
    private String pictureAddress;
}
