package com.example.PriceComparisionSnapshot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.PriceComparisionSnapshot.entity.user;
import com.example.PriceComparisionSnapshot.services.UserServices;

@RestController
@RequestMapping("/users")
public class UserControl {

    @Autowired
    private UserServices userServices;

    @GetMapping
    public ResponseEntity<?> listUsers() {
        return ResponseEntity.ok(userServices.getAllUsers());
    }

    @PostMapping
    public ResponseEntity<?> createUser(@RequestBody user user) {
        return ResponseEntity.ok(userServices.createUser(user));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getUser(@PathVariable Long id) {
        return ResponseEntity.ok(userServices.getUserById(id));
    }

}