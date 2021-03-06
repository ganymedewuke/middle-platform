package com.ganymede.mapper;

import com.ganymede.entity.ProductType;

public interface ProductTypeMapper {
    void insertProductType(ProductType productType);

    ProductType findById(long id);

    void updateProductType(ProductType productType);
}
