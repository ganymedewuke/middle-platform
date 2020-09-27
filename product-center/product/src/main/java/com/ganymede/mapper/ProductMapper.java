package com.ganymede.mapper;

import com.ganymede.entity.Product;

public interface ProductMapper {
    void insertProduct(Product product);

    void updateStatusBy(Product product);

    Product selectById(Long id);

    void updateInfo(Product product);
}
