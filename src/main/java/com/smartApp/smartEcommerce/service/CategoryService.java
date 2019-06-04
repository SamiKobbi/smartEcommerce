package com.smartApp.smartEcommerce.service;

import java.util.List;


import com.smartApp.smartEcommerce.models.Category;


public interface CategoryService {
	   /**
     * Updates the specified category, identified by its id.
     *
     * @param category   The category to update.
     * @return          True if the update succeeded, otherwise false.
     */
	List<Category> findAll();
    /**
     * Saves the specified categoryCategory to the database.
     *
     * @param category   The category to save to the database.
     * @return          The saved product.
     */
	Category save(Category category);
}
