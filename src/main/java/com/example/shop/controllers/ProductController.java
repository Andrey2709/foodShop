package com.example.shop.controllers;

import com.example.shop.loger.ToLog;
import com.example.shop.model.Product;
import com.example.shop.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProductController {

    private ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping("/v2/product/{id}")
    @ResponseBody
    public Product findProductById(@PathVariable Long id) {
         Product p = service.findById(id);
        return p;
    }


    @GetMapping("/v1/product")
    public String findProductById(Model model) {

        return "product_page";
    }



}
