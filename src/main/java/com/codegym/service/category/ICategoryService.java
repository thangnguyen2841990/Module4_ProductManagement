package com.codegym.service.category;

import com.codegym.model.Category;
import com.codegym.model.Product;
import com.codegym.service.IGeneralService;
import org.springframework.stereotype.Service;

@Service
public interface ICategoryService extends IGeneralService<Category> {

    void deleteCategory(Long id);

}
