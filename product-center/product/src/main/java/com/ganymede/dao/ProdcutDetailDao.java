package com.ganymede.dao;

import com.ganymede.entity.ProductDetail;

public interface ProdcutDetailDao {
    void insertProductDetail(ProductDetail productDetail);

    void updateProductDetailById(ProductDetail productDetail);

    ProductDetail selectProductDetailById(long id);
}
