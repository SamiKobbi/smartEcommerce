package com.smartApp.smartEcommerce.repository;



import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.smartApp.smartEcommerce.models.Category;


/**
 * Defines the persistence methods for a ProductRepository.
 */
public interface CategoryRepository   extends CrudRepository<Category, String>  {

}
