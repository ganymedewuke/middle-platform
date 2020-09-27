package com.ganymede.service;

import com.ganymede.entity.Product;
import com.ganymede.entity.ProductDetail;

public interface ProductDetailService {
    void insertProductDetail(Product product, ProductDetail productDetail);

    void updateProductDetailById(ProductDetail productDetail);

    ProductDetail selectProductDetailById(long id);
}
