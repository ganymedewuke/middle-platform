package com.ganymede.service;

import com.ganymede.entity.Product;

public interface ProductService {
    void insertProduct(Product product);

    void updateStatusBy(Product product);

    Product selectById(Long id);

    void updateInfo(Product product);

}
