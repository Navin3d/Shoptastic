package gmc.project.shoptastic.services;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

import gmc.project.shoptastic.domain.Products;
import gmc.project.shoptastic.repositories.ProductsRepository;

@Service
public class ProductsServiceImpl implements ProductsService {

	private final ProductsRepository productsRepository;
	
	public ProductsServiceImpl(ProductsRepository productsRepository) {
		this.productsRepository = productsRepository;
	}

	@Override
	@Transactional
	public Set<Products> getAllProducts() {		
		Set<Products> productsSet = new HashSet<>();		
		productsRepository.findAll().iterator().forEachRemaining(productsSet::add);		
		return productsSet;
	}

	@Override
	public Products findProduct(Long id) {
		Optional<Products> productsOptional = productsRepository.findById(id);

		if(productsOptional.isEmpty())
			throw new RuntimeException("The Product WIth id " + id + " not found...");

		Products product = productsOptional.get();

		return product;
	}

}
