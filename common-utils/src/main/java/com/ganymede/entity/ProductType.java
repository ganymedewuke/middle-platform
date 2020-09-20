package com.ganymede.entity;

import lombok.Data;

@Data
public class ProductType {
    private long id;
    private String productTypeName;
    private String productTypeDesc;
    private long productTypeParentId;
    private int productTypeLevel;

}
