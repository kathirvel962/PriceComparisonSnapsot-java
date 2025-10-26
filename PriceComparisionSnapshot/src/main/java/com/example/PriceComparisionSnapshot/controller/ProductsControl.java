package com.example.PriceComparisionSnapshot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.PriceComparisionSnapshot.entity.products;
import com.example.PriceComparisionSnapshot.services.ProductsService;
@RestController
@RequestMapping("/products")
public class ProductsControl{
    @Autowired  
    private ProductsService productServices;

    @GetMapping
    public ResponseEntity<?> listProducts() {
        return ResponseEntity.ok(productServices.getAllProducts());
    }

    @PostMapping
    public ResponseEntity<?> createProduct(@RequestBody products product) {
        return ResponseEntity.ok(productServices.createProduct(product));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getProduct(@PathVariable int id) {
        return ResponseEntity.ok(productServices.getProductById(id));
    }


}