package com.ganymede.control;


import com.ganymede.entity.ProductType;
import com.ganymede.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
        model.addAttribute("message", "添加成功!");
        return "success";
    }

    @RequestMapping(value = "findById")
    public String findById(long id, Model model) {
        ProductType productType = productTypeService.findById(id);
        model.addAttribute("productType", productType);
        return "viewById";
    }


    @RequestMapping(value = "toUpdate")
    public String toUpdate(long id, Model model) {
        ProductType productType = productTypeService.findById(id);
        model.addAttribute("productType", productType);
        return "toUpdate";
    }


    @RequestMapping(value = "update", method = RequestMethod.POST)
    public String update(ProductType productType, Model model) {
        productTypeService.updateProductType(productType);
        model.addAttribute("message", "修改成功!");
        return "success";
    }

}
