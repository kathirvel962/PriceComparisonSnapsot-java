package com.example.PriceComparisionSnapshot.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.PriceComparisionSnapshot.entity.products;
public interface ProductsRepositry extends JpaRepository<products, Long> {

}