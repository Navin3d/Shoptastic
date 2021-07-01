package gmc.project.shoptastic.services;

import java.util.Set;

import gmc.project.shoptastic.domain.Products;

public interface ProductsService {
	Set<Products> getAllProducts();
	Products findProduct(Long id);
}
