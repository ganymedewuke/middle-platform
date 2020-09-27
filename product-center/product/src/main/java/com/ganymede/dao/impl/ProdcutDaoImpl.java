package com.ganymede.dao.impl;

import com.ganymede.dao.ProdcutDao;
import com.ganymede.entity.Product;
import com.ganymede.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProdcutDaoImpl implements ProdcutDao {
    @Autowired
    private ProductMapper productMapper;

    @Override
    public void insertProduct(Product product) {
        productMapper.insertProduct(product);
    }

    @Override
    public void updateStatusBy(Product product) {
        productMapper.updateStatusBy(product);
    }

    @Override
    public Product selectById(Long id) {
        return productMapper.selectById(id);
    }

    @Override
    public void updateInfo(Product product) {
        productMapper.updateInfo(product);
    }
}
