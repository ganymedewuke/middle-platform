package com.ganymede.control;

import com.ganymede.entity.Product;
import com.ganymede.entity.ProductDetail;
import com.ganymede.service.ProductDetailService;
import com.ganymede.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@Controller
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductDetailService productDetailService;

    @RequestMapping("hello")
    public String hello(String name) {
        return name;
    }

    @RequestMapping("toInsert")
    public String toInsert() {
        return "toInsert";
    }

    @RequestMapping(value = "insert", method = RequestMethod.POST)
    public String insert(Product product, Model model) {
        product.setCreatTime(new Date());
        product.setApproveStatus(0);
        product.setSellNums(0);
        productService.insertProduct(product);
        model.addAttribute("message", "添加成功！");
        return "success";
    }

    @RequestMapping("toApprove")
    public String toApprove(long id, Model model) {
        Product product = productService.selectById(id);
        model.addAttribute("product", product);
        return "toApprove";
    }


    @RequestMapping(value = "approve", method = RequestMethod.POST)
    public String approve(Product product, Model model) {
        product.setApproveTime(new Date());
        productService.updateStatusBy(product);
        model.addAttribute("message", "审核完成！");
        return "success";
    }


    @RequestMapping("toUpdate")
    public String toUpdate(long id, Model model) {
        Product product = productService.selectById(id);
        model.addAttribute("product", product);
        return "toUpdate";
    }


    @RequestMapping(value = "update", method = RequestMethod.POST)
    public String update(Product product, Model model) {
        product.setUpdateTime(new Date());
        productService.updateInfo(product);
        model.addAttribute("message", "商品信息修改完成！");
        return "success";
    }


    @RequestMapping("findById")
    public String findById(long id, Model model) {
        Product product = productService.selectById(id);
        model.addAttribute("product", product);
        return "viewById";
    }


    @RequestMapping("toProductDetail")
    public String toProductDetail(long id, Model model) {
        Product product = productService.selectById(id);
        model.addAttribute("product", product);
        return "toProductDetail";
    }


    @RequestMapping(value = "insertProductDetail", method = RequestMethod.POST)
    public String insertProductDetail(Product product, ProductDetail productDetail, Model model) {
        productDetailService.insertProductDetail(product, productDetail);
        model.addAttribute("message", "商品信息补充成功！");
        return "success";
    }

    @RequestMapping("toUpdateDetail")
    public String toUpdateDetail(long id, Model model) {
        ProductDetail productDetail = productDetailService.selectProductDetailById(id);
        model.addAttribute("productDetail", productDetail);

        Product product = productService.selectById(id);
        model.addAttribute("product", product);

        return "toUpdateDetail";
    }


    @RequestMapping(value = "updateDetail", method = RequestMethod.POST)
    public String updateDetail(ProductDetail productDetail , Model model) {
        productDetail.setUpdateTime(new Date());
        productDetailService.updateProductDetailById(productDetail);
        model.addAttribute("message", "商品详情信息修改完成！");
        return "success";
    }
}
