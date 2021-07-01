package gmc.project.shoptastic.services;

import gmc.project.shoptastic.domain.Categories;
import gmc.project.shoptastic.domain.Category;
import gmc.project.shoptastic.domain.Products;
import gmc.project.shoptastic.repositories.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class CategoryServiceImpl implements CategoryService{

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Set<Category> getCategory() {
        Set<Category> categorySet = new HashSet<>();
        categoryRepository.findAll().iterator().forEachRemaining(categorySet::add);
        return categorySet;
    }

    @Override
    public Set<Products> getCategoryProducts(Categories category) {
        Optional<Category> categoryOptional = categoryRepository.findByCategories(category);

        if(!categoryOptional.isPresent()) {
            throw new RuntimeException("The Expected Category not found...");
        }

        Category foundCategory = categoryOptional.get();

        Set<Products> foundProducts = foundCategory.getProductCategory();

        return foundProducts;
    }


}
