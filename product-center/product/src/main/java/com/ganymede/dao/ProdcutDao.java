package com.ganymede.dao;

import com.ganymede.entity.Product;

public interface ProdcutDao {
    void insertProduct(Product product);

    void updateStatusBy(Product product);

    Product selectById(Long id);

    void updateInfo(Product product);
}
