package com.example.shop.repositorys;

import com.example.shop.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;


public interface ProductRepository extends JpaRepository<Product,Long> {

//@Query("")
//    Optional<Product> findByName(String name);
}
