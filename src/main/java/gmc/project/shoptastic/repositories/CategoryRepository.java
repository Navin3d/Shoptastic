package gmc.project.shoptastic.repositories;

import java.util.Optional;

import gmc.project.shoptastic.domain.Categories;
import org.springframework.data.repository.CrudRepository;

import gmc.project.shoptastic.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long>{
	Optional<Category> findByCategories(Categories categories);
}
