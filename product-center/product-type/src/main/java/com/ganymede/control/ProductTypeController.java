package com.ganymede.control;


import com.ganymede.entity.MemberInfo;
import com.ganymede.entity.ProductType;
import com.ganymede.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
@RequestMapping("productType")
public class ProductTypeController {

    @Autowired
    private ProductTypeService productTypeService;

    @RequestMapping("hello")
    public String hello(String name) {
        return name;
    }

    @RequestMapping(value = "toInsert")
    public String toInsert() {
        return "toInsert";
    }

    @RequestMapping(value = "insert", method = RequestMethod.POST)
    public String insert(ProductType productType, Model model) {
        productTypeService.insertProductType(productType);
        return "success";
    }


}
