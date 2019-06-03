package com.smartApp.smartEcommerce.repository;



import java.util.List;
import java.util.Optional;

import com.smartApp.smartEcommerce.models.Category;

/**
 * Defines the persistence methods for a ProductRepository.
 */
public interface CategoryRepository {


    /**
     * Returns all products in the database.
     *
     * @return          All products in the database.
     */
    List<Category> findAll();
    /**
     * Saves the specified product to the database.
     *
     * @param product   The product to save to the database.
     * @return          The saved product.
     */
	Category save(Category category);
}
