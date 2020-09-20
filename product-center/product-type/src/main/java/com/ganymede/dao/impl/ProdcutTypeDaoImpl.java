package com.ganymede.dao.impl;

import com.ganymede.dao.ProdcutTypeDao;
import com.ganymede.entity.ProductType;
import com.ganymede.mapper.ProductTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProdcutTypeDaoImpl implements ProdcutTypeDao {
    @Autowired
    private ProductTypeMapper productTypeMapper;

    @Override
    public void insertProductType(ProductType productType) {
        productTypeMapper.insertProductType(productType);
    }

    @Override
    public ProductType findById(long id) {
        return productTypeMapper.findById(id);
    }

    @Override
    public void updateProductType(ProductType productType) {
        productTypeMapper.updateProductType(productType);
    }
}
