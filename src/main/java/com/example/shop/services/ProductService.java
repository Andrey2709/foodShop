package com.example.shop.services;

import com.example.shop.loger.ToLog;
import com.example.shop.model.Product;
import com.example.shop.repositorys.ProductRepository;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private ProductRepository repo;


    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    @ToLog
    public Product findById(Long id) {
        Optional<Product> p = repo.findById(id);
        System.out.println(p);
        Product product = p.get();
        return product;
    }


    public List<Product>   findAll() {
        List<Product> list = repo.findAll();
        return list;


    }

//    public Product findByName(String name) {
//        Optional<Product> p = repo.findByName(name);
//        Product product = p.get();
//        return product;
//    }

}
