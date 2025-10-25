package com.example.PriceComparisionSnapshot.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.PriceComparisionSnapshot.repository.UserRepository;
import com.example.PriceComparisionSnapshot.entity.user;
@Service
public class UserServices {
    @Autowired
    private UserRepository userRepository;

    public List<user> getAllUsers() {
        return userRepository.findAll();
    }

    public user createUser(user newUser) {
        return userRepository.save(newUser);
    }
    
    public user getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }
    
    public user updUser(long id,user usr)
    {
                user user = userRepository.findById(id).orElseThrow();
                user.setName(usr.getName());
                user.setEmail(usr.getEmail());
                user.setRole(usr.getRole());
                user.setJoin_date(usr.getJoin_date());
                return userRepository.save(user);


    }
    public  void deleteUser(long id)
    {
        userRepository.deleteById(id);
    }
}
