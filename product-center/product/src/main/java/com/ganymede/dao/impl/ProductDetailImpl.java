package com.ganymede.dao.impl;

import com.ganymede.dao.ProdcutDetailDao;
import com.ganymede.entity.ProductDetail;
import com.ganymede.mapper.ProductDetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductDetailImpl implements ProdcutDetailDao {
    @Autowired
    private ProductDetailMapper productDetailMapper;

    @Override
    public void insertProductDetail(ProductDetail productDetail) {
        productDetailMapper.insertProductDetail(productDetail);
    }

    @Override
    public void updateProductDetailById(ProductDetail productDetail) {
        productDetailMapper.updateProductDetailById(productDetail);
    }

    @Override
    public ProductDetail selectProductDetailById(long id) {
        return productDetailMapper.selectProductDetailById(id);
    }
}
