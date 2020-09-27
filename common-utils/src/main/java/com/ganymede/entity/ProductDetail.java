package com.ganymede.entity;

import lombok.Data;

import java.util.Date;

@Data
public class ProductDetail {
    private long id;
    private long productId;
    private String productPlace;
    private String productName;
    private String productBrand;
    private String productWeight;
    private String productSpecification;
    private String productDetailPic;
    private Date createTime;
    private Date updateTime;
}
