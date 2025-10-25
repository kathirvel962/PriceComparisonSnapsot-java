package com.example.PriceComparisionSnapshot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.PriceComparisionSnapshot.entity.user;
import com.example.PriceComparisionSnapshot.services.UserServices;  
@Controller
@RequestMapping("/users")
public class UserControl {

	@Autowired
	private UserServices userServices;

	@GetMapping
	public String listUsers(Model model) {
		model.addAttribute("users", userServices.getAllUsers());
		return "users";
	}

	@GetMapping("/add")
	public String showAddForm(Model model) {
		model.addAttribute("user", new user());
		return "add-user";
	}

	@PostMapping
	public String saveUser(@ModelAttribute user user) {
		userServices.createUser(user);
		return "redirect:/users";
	}

	@GetMapping("/edit/{id}")
	public String showEditForm(@PathVariable Long id, Model model) {
		model.addAttribute("user", userServices.getUserById(id));
		return "edit-user";
	}

}