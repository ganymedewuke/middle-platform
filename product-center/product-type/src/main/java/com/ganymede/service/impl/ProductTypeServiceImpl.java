package com.ganymede.service.impl;

import com.ganymede.dao.ProdcutTypeDao;
import com.ganymede.entity.ProductType;
import com.ganymede.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductTypeServiceImpl implements ProductTypeService {

    @Autowired
    private ProdcutTypeDao prodcutTypeDao;

    @Override
    public void insertProductType(ProductType productType) {
        prodcutTypeDao.insertProductType(productType);
    }

    @Override
    public ProductType findById(long id) {
        return prodcutTypeDao.findById(id);
    }

    @Override
    public void updateProductType(ProductType productType) {
        prodcutTypeDao.updateProductType(productType);
    }


}
