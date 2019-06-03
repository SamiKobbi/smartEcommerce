package com.smartApp.smartEcommerce.service;

import java.util.List;


import com.smartApp.smartEcommerce.models.Category;


public interface CategoryService {
	   /**
     * Updates the specified product, identified by its id.
     *
     * @param product   The product to update.
     * @return          True if the update succeeded, otherwise false.
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
