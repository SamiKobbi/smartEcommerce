package com.smartApp.smartEcommerce.service;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.smartApp.smartEcommerce.models.Category;
import com.smartApp.smartEcommerce.repository.CategoryRepository;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;



@ExtendWith(SpringExtension.class)
@SpringBootTest
public class CategoryServiceTest {
	
    @Autowired
    private CategoryService service;

    /**
     * A mock version of the ProductRepository for use in our tests.
     */
    @MockBean
    private CategoryRepository repository;
    
    @Test
    @DisplayName("Test findAll")
    void testFindAll() {
        // Setup our mock
        Category mockCategory1 = new Category(1L, "Bikes");
        Category mockCategory2 = new Category(2L, "PCs");
        doReturn(Arrays.asList(mockCategory1, mockCategory2)).when(repository).findAll();

        // Execute the service call
        List<Category> categories = service.findAll();

        Assertions.assertEquals(2, categories.size(), "findAll should return 2 products");
    }
    @Test
    @DisplayName("Test save category")
    void testSave() {
    	Category mockCategory = new Category(1L, "Bikes");
        doReturn(mockCategory).when(repository).save(any());

        Category returnedCategory = service.save(mockCategory);

        Assertions.assertNotNull(returnedCategory, "The saved category should not be null");
        Assertions.assertEquals("Bikes", returnedCategory.getName(),
                "The category should be Bikes");
    }
}
