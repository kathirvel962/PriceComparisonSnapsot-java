package com.example.PriceComparisionSnapshot.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.PriceComparisionSnapshot.entity.user;
public interface UserRepository extends JpaRepository<user, Long> {

}