package com.ganymede.service;

import com.ganymede.entity.ProductType;

public interface ProductTypeService {
    void insertProductType(ProductType productType);

    ProductType findById(long id);

    void updateProductType(ProductType productType);
}
