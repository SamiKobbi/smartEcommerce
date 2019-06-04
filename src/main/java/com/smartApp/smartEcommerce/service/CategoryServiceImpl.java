package com.smartApp.smartEcommerce.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.smartApp.smartEcommerce.models.Category;
import com.smartApp.smartEcommerce.repository.CategoryRepository;



@Service
public class CategoryServiceImpl implements CategoryService {
	
	private final CategoryRepository categoryRepository;
	public CategoryServiceImpl(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}


	@Override
	public List<Category> findAll() {
		ArrayList<Category> categories = new ArrayList<Category>();
		categoryRepository.findAll().forEach(i -> categories.add(i));
		return categories;
	}


	@Override
	public Category save(Category category) {
		return categoryRepository.save(category);
	}


	public CategoryRepository getCategoryRepository() {
		return categoryRepository;
	}
}
