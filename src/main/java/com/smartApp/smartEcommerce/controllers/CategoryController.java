package com.smartApp.smartEcommerce.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.smartApp.smartEcommerce.models.Category;



@RestController
@RequestMapping("/category")
public class CategoryController {
	
	
	@GetMapping("getAll")
	public List<Category> list() {
		return new ArrayList<Category>();
	}
	
	@PostMapping("create")
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody Category category) {	
		System.out.println(category.getName());
	
	}

}
