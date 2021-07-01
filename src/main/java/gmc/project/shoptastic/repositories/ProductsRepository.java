package gmc.project.shoptastic.repositories;

import org.springframework.data.repository.CrudRepository;

import gmc.project.shoptastic.domain.Products;

public interface ProductsRepository extends CrudRepository<Products, Long>{

}
