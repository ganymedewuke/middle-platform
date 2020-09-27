package com.ganymede.service.impl;

import com.ganymede.dao.ProdcutDao;
import com.ganymede.dao.ProdcutDetailDao;
import com.ganymede.entity.Product;
import com.ganymede.entity.ProductDetail;
import com.ganymede.service.ProductDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ProductDetailServiceImpl implements ProductDetailService {

    @Autowired
    private ProdcutDetailDao prodcutDetailDao;

    @Override
    public void insertProductDetail(Product product, ProductDetail productDetail) {
        productDetail.setProductId(product.getId());
        productDetail.setProductName(product.getProductName());
        productDetail.setCreateTime(new Date());

        prodcutDetailDao.insertProductDetail(productDetail);
    }

    @Override
    public void updateProductDetailById(ProductDetail productDetail) {
        productDetail.setUpdateTime(new Date());
        prodcutDetailDao.updateProductDetailById(productDetail);
    }

    @Override
    public ProductDetail selectProductDetailById(long id) {
        return prodcutDetailDao.selectProductDetailById(id);
    }
}
