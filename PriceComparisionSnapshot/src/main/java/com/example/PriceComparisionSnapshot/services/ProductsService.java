package com.example.PriceComparisionSnapshot.services;
import java.util.List;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.PriceComparisionSnapshot.repository.ProductsRepositry;
import com.example.PriceComparisionSnapshot.entity.products;
@Service
public class ProductsService {
    @Autowired
    private ProductsRepositry productsRepositry;

    public List<products> getAllProducts() {
        return productsRepositry.findAll();
    }

    public products createProduct(products newProduct) {
        // Ensure the added_at timestamp is set when creating a product
        if (newProduct.getAdded_at() == null) {
            newProduct.setAdded_at(LocalDateTime.now());
        }
        return productsRepositry.save(newProduct);
    }
    
        public products getProductById(int id) {
            return productsRepositry.findById((long) id).orElse(null);
        }
    }