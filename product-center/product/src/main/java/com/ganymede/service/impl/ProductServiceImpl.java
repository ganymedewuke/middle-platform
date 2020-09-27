package com.ganymede.service.impl;

import com.ganymede.dao.ProdcutDao;
import com.ganymede.entity.Product;
import com.ganymede.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProdcutDao prodcutDao;


    @Override
    public void insertProduct(Product product) {
        prodcutDao.insertProduct(product);
    }

    @Override
    public void updateStatusBy(Product product) {
        prodcutDao.updateStatusBy(product);
    }

    @Override
    public Product selectById(Long id) {
        return prodcutDao.selectById(id);
    }

    @Override
    public void updateInfo(Product product) {
        prodcutDao.updateInfo(product);
    }
}
