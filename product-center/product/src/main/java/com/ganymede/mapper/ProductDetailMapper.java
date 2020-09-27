package com.ganymede.mapper;

import com.ganymede.entity.ProductDetail;

public interface ProductDetailMapper {
    void insertProductDetail(ProductDetail productDetail);

    void updateProductDetailById(ProductDetail productDetail);

    ProductDetail selectProductDetailById(long id);
}
