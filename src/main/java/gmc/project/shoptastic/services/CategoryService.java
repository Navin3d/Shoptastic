package gmc.project.shoptastic.services;

import gmc.project.shoptastic.domain.Categories;
import gmc.project.shoptastic.domain.Category;
import gmc.project.shoptastic.domain.Products;

import java.util.Set;

public interface CategoryService {
    Set<Category> getCategory();
    Set<Products> getCategoryProducts(Categories Category);
}
