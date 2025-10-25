package com.example.PriceComparisionSnapshot.entity;


import java.time.LocalDateTime;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;


public class priceEntries {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int entry_id;
    private int product_id;
    private int vendor_id;
    private int price;
    private LocalDateTime entry_date;

    
}
