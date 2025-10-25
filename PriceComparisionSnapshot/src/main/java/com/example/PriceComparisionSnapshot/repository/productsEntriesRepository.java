package com.example.PriceComparisionSnapshot.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.PriceComparisionSnapshot.entity.priceEntries;
public interface productsEntriesRepository extends JpaRepository<priceEntries, Long> {

}