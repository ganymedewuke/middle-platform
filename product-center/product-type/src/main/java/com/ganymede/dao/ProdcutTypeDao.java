package com.ganymede.dao;

import com.ganymede.entity.ProductType;

public interface ProdcutTypeDao {
    void insertProductType(ProductType productType);

    ProductType findById(long id);

    void updateProductType(ProductType productType);
}
