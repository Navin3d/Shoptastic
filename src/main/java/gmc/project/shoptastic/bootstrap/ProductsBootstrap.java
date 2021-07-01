package gmc.project.shoptastic.bootstrap;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;

import gmc.project.shoptastic.domain.Categories;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import javax.transaction.Transactional;

import gmc.project.shoptastic.domain.Category;
import gmc.project.shoptastic.domain.Products;
import gmc.project.shoptastic.repositories.CategoryRepository;
import gmc.project.shoptastic.repositories.ProductsRepository;

@Component
public class ProductsBootstrap implements ApplicationListener<ContextRefreshedEvent>{

	private final ProductsRepository productsRepository;
	private final CategoryRepository categoryRepository;
	
	public ProductsBootstrap(ProductsRepository productsRepository, CategoryRepository categoryRepository) {
		this.productsRepository = productsRepository;
		this.categoryRepository = categoryRepository;
	}

	public List<Products> getProducts() {		
		
		List<Products> productsList = new ArrayList<>();
		
		Optional<Category> mobileOptional = categoryRepository.findByCategories(Categories.MOBILES_AND_GADGETS);
		if(!mobileOptional.isPresent()) {
			throw new RuntimeException("Expected category not found...");
		}

		Optional<Category> mensfootwearOptional = categoryRepository.findByCategories(Categories.MENS_FOOTWEAR);
		if(!mensfootwearOptional.isPresent()) {
			throw new RuntimeException("Expected category not found...");
		}

		Optional<Category> masalasOptional = categoryRepository.findByCategories(Categories.Masalas_Both_Industry_And_Home_made);
		if(!masalasOptional.isPresent()) {
			throw new RuntimeException("Expected category not found...");
		}

		Optional<Category> mensClothingOptional = categoryRepository.findByCategories(Categories.MENS_CLOTHING);
		if(!mobileOptional.isPresent()) {
			throw new RuntimeException("Expected category not found...");
		}

		Optional<Category> toysOptional = categoryRepository.findByCategories(Categories.BEAUTY_AND_TOYS);
		if(!mobileOptional.isPresent()) {
			throw new RuntimeException("Expected category not found...");
		}

		Optional<Category> householdOptional = categoryRepository.findByCategories(Categories.HOUSE_HOLD_APPLIANCES);
		if(!mobileOptional.isPresent()) {
			throw new RuntimeException("Expected category not found...");
		}

		Optional<Category> computerAccesOptional = categoryRepository.findByCategories(Categories.COMPUTER_AND_ACCESSORIES);
		if(!mobileOptional.isPresent()) {
			throw new RuntimeException("Expected category not found...");
		}

		Optional<Category> bestOfferOptional = categoryRepository.findByCategories(Categories.BEST_OFFER_WITH_MAJOR_DISCOUNTS);
		if(!mobileOptional.isPresent()) {
			throw new RuntimeException("Expected category not found...");
		}

		Optional<Category> furnituresOptional = categoryRepository.findByCategories(Categories.FURNITURE);
		if(!mobileOptional.isPresent()) {
			throw new RuntimeException("Expected category not found...");
		}

		Category mobiles = mobileOptional.get();
		Category mensFootwear = mensfootwearOptional.get();
		Category masala = masalasOptional.get();
		Category mensCloting = mensClothingOptional.get();
		Category toys = toysOptional.get();
		Category houseHold = householdOptional.get();
		Category computerAndAccessories = computerAccesOptional.get();
		Category bestOffer = bestOfferOptional.get();
		Category furnitures = furnituresOptional.get();
		
		Products product1 = new Products();
		product1.setName("Apple iPhone 12 Pro Max (512GB)");
		product1.setDescription("This is an iphone");
		product1.setStock(92);
		product1.setPrice(2500);
		product1.setImageUrl("https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/iphone-12-pro-max-graphite-hero?wid=940&amp;hei=1112&amp;fmt=png-alpha&amp;qlt=80&amp;.v=1604021658000");
		
		product1.setCategory(mobiles);
		mobiles.getProductCategory().add(product1);

		productsList.add(product1);
		
		Products product2 = new Products();
		product2.setName("Apple iPhone 12 Pro Max (512GB)");
		product2.setDescription("This is an iphone");
		product2.setStock(92);
		product2.setPrice(2500);
		product2.setImageUrl("https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/iphone-12-pro-max-graphite-hero?wid=940&amp;hei=1112&amp;fmt=png-alpha&amp;qlt=80&amp;.v=1604021658000");
				
		product2.setCategory(mobiles);
		mobiles.getProductCategory().add(product2);

		productsList.add(product2);
		
		Products product3 = new Products();
		product3.setName("Apple iPhone 12 Pro Max (512GB)");
		product3.setDescription("This is an iphone");
		product3.setStock(92);
		product3.setPrice(2500);
		product3.setImageUrl("https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/iphone-12-pro-max-graphite-hero?wid=940&amp;hei=1112&amp;fmt=png-alpha&amp;qlt=80&amp;.v=1604021658000");
				
		product3.setCategory(mobiles);
		mobiles.getProductCategory().add(product3);

		productsList.add(product3);
		
		Products product4 = new Products();
		product4.setName("Apple iPhone 12 Pro Max (512GB)");
		product4.setDescription("This is an iphone");
		product4.setStock(92);
		product4.setPrice(2500);
		product4.setImageUrl("https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/iphone-12-pro-max-graphite-hero?wid=940&amp;hei=1112&amp;fmt=png-alpha&amp;qlt=80&amp;.v=1604021658000");
				
		product4.setCategory(mobiles);
		mobiles.getProductCategory().add(product4);

		productsList.add(product4);
		
		Products product5 = new Products();
		product5.setName("Apple iPhone 12 Pro Max (512GB)");
		product5.setDescription("This is an iphone");
		product5.setStock(92);
		product5.setPrice(2500);
		product5.setImageUrl("https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/iphone-12-pro-max-graphite-hero?wid=940&amp;hei=1112&amp;fmt=png-alpha&amp;qlt=80&amp;.v=1604021658000");
				
		product5.setCategory(mobiles);
		mobiles.getProductCategory().add(product5);

		productsList.add(product5);
		
		Products product6 = new Products();
		product6.setName("Apple iPhone 12 Pro Max (512GB)");
		product6.setDescription("This is an iphone");
		product6.setStock(92);
		product6.setPrice(2500);
		product6.setImageUrl("https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/iphone-12-pro-max-graphite-hero?wid=940&amp;hei=1112&amp;fmt=png-alpha&amp;qlt=80&amp;.v=1604021658000");
				
		product6.setCategory(mobiles);
		mobiles.getProductCategory().add(product6);

		productsList.add(product6);
		
		Products product7 = new Products();
		product7.setName("Apple iPhone 12 Pro Max (512GB)");
		product7.setDescription("This is an iphone");
		product7.setStock(92);
		product7.setPrice(2500);
		product7.setImageUrl("https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/iphone-12-pro-max-graphite-hero?wid=940&amp;hei=1112&amp;fmt=png-alpha&amp;qlt=80&amp;.v=1604021658000");
				
		product7.setCategory(mobiles);
		mobiles.getProductCategory().add(product7);

		productsList.add(product7);
		
		Products product8 = new Products();
		product8.setName("Apple iPhone 12 Pro Max (512GB)");
		product8.setDescription("This is an iphone");
		product8.setStock(92);
		product8.setPrice(2500);
		product8.setImageUrl("https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/iphone-12-pro-max-graphite-hero?wid=940&amp;hei=1112&amp;fmt=png-alpha&amp;qlt=80&amp;.v=1604021658000");
				
		product8.setCategory(mobiles);
		mobiles.getProductCategory().add(product8);

		productsList.add(product8);
		
		Products product9 = new Products();
		product9.setName("Apple iPhone 12 Pro Max (512GB)");
		product9.setDescription("This is an iphone");
		product9.setStock(92);
		product9.setPrice(2500);
		product9.setImageUrl("https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/iphone-12-pro-max-graphite-hero?wid=940&amp;hei=1112&amp;fmt=png-alpha&amp;qlt=80&amp;.v=1604021658000");
				
		product9.setCategory(mobiles);
		mobiles.getProductCategory().add(product9);

		productsList.add(product9);
		
		Products product10 = new Products();
		product10.setName("Apple iPhone 12 Pro Max (512GB)");
		product10.setDescription("This is an iphone");
		product10.setStock(92);
		product10.setPrice(2500);
		product10.setImageUrl("https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/iphone-12-pro-max-graphite-hero?wid=940&amp;hei=1112&amp;fmt=png-alpha&amp;qlt=80&amp;.v=1604021658000");
				
		product10.setCategory(mobiles);
		mobiles.getProductCategory().add(product10);

		productsList.add(product10);
		
		Products product11 = new Products();
		product11.setName("Apple iPhone 12 Pro Max (512GB)");
		product11.setDescription("This is an iphone");
		product11.setStock(92);
		product11.setPrice(2500);
		product11.setImageUrl("https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/iphone-12-pro-max-graphite-hero?wid=940&amp;hei=1112&amp;fmt=png-alpha&amp;qlt=80&amp;.v=1604021658000");
				
		product11.setCategory(mobiles);
		mobiles.getProductCategory().add(product11);

		productsList.add(product11);
		
		Products product12 = new Products();
		product12.setName("Apple iPhone 12 Pro Max (512GB)");
		product12.setDescription("This is an iphone");
		product12.setStock(92);
		product12.setPrice(2500);
		product12.setImageUrl("https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/iphone-12-pro-max-graphite-hero?wid=940&amp;hei=1112&amp;fmt=png-alpha&amp;qlt=80&amp;.v=1604021658000");
				
		product12.setCategory(mobiles);
		mobiles.getProductCategory().add(product12);

		productsList.add(product12);
		
////////////////////////////////////////////////////////////////////////////////////////
///////////////////////CATEGORY MEN'S FOOTWEAR//////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////
			
		Products product13 = new Products();
		product13.setName("Bata Loofer");
		product13.setDescription("This is an Bata product");
		product13.setStock(92);
		product13.setPrice(2500);
		product13.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRDhOSvAg-Dl3DU5BAAn9Q47MfD4UhtNvMMaA&usqp=CAU");
		
		product13.setCategory(mensFootwear);
		mensFootwear.getProductCategory().add(product13);
		
		productsList.add(product13);
		
		Products product14 = new Products();
		product14.setName("Bata Loofer");
		product14.setDescription("This is an aata product");
		product14.setStock(92);
		product14.setPrice(2500);
		product14.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRDhOSvAg-Dl3DU5BAAn9Q47MfD4UhtNvMMaA&usqp=CAU");
		
		product14.setCategory(mensFootwear);
		mensFootwear.getProductCategory().add(product14);
		
		productsList.add(product14);
		
		Products product15 = new Products();
		product15.setName("Bata Loofer");
		product15.setDescription("This is an iphone");
		product15.setStock(92);
		product15.setPrice(2500);
		product15.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRDhOSvAg-Dl3DU5BAAn9Q47MfD4UhtNvMMaA&usqp=CAU");
		
		product15.setCategory(mensFootwear);
		mensFootwear.getProductCategory().add(product15);
		
		productsList.add(product15);
		
		Products product16 = new Products();
		product16.setName("Bata Loofer");
		product16.setDescription("This is an iphone");
		product16.setStock(92);
		product16.setPrice(2500);
		product16.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRDhOSvAg-Dl3DU5BAAn9Q47MfD4UhtNvMMaA&usqp=CAU");
		
		product16.setCategory(mensFootwear);
		mensFootwear.getProductCategory().add(product16);
		
		productsList.add(product16);
		
		Products product17 = new Products();
		product17.setName("Bata Loofer");
		product17.setDescription("This is an iphone");
		product17.setStock(92);
		product17.setPrice(2500);
		product17.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRDhOSvAg-Dl3DU5BAAn9Q47MfD4UhtNvMMaA&usqp=CAU");
		
		product17.setCategory(mensFootwear);
		mensFootwear.getProductCategory().add(product17);
		
		productsList.add(product17);
		
		Products product18 = new Products();
		product18.setName("Bata Loofer");
		product18.setDescription("This is an iphone");
		product18.setStock(92);
		product18.setPrice(2500);
		product18.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRDhOSvAg-Dl3DU5BAAn9Q47MfD4UhtNvMMaA&usqp=CAU");
		
		product18.setCategory(mensFootwear);
		mensFootwear.getProductCategory().add(product18);
		
		productsList.add(product18);
		
		Products product19 = new Products();
		product19.setName("Bata Loofer");
		product19.setDescription("This is an iphone");
		product19.setStock(92);
		product19.setPrice(2500);
		product19.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRDhOSvAg-Dl3DU5BAAn9Q47MfD4UhtNvMMaA&usqp=CAU");
		
		product19.setCategory(mensFootwear);
		mensFootwear.getProductCategory().add(product19);
		
		productsList.add(product19);
		
		Products product20 = new Products();
		product20.setName("Bata Loofer");
		product20.setDescription("This is an iphone");
		product20.setStock(92);
		product20.setPrice(2500);
		product20.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRDhOSvAg-Dl3DU5BAAn9Q47MfD4UhtNvMMaA&usqp=CAU");
		
		product20.setCategory(mensFootwear);
		mensFootwear.getProductCategory().add(product20);
		
		productsList.add(product20);
		
		Products product21 = new Products();
		product21.setName("Bata Loofer");
		product21.setDescription("This is an iphone");
		product21.setStock(92);
		product21.setPrice(2500);
		product21.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRDhOSvAg-Dl3DU5BAAn9Q47MfD4UhtNvMMaA&usqp=CAU");
		
		product21.setCategory(mensFootwear);
		mensFootwear.getProductCategory().add(product21);
		
		productsList.add(product21);
		
		Products product22 = new Products();
		product22.setName("Bata Loofer");
		product22.setDescription("This is an iphone");
		product22.setStock(92);
		product22.setPrice(2500);
		product22.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRDhOSvAg-Dl3DU5BAAn9Q47MfD4UhtNvMMaA&usqp=CAU");
		
		product22.setCategory(mensFootwear);
		mensFootwear.getProductCategory().add(product22);
		
		productsList.add(product22);
		
		Products product23 = new Products();
		product23.setName("Bata Loofer");
		product23.setDescription("This is an iphone");
		product23.setStock(92);
		product23.setPrice(2500);
		product23.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRDhOSvAg-Dl3DU5BAAn9Q47MfD4UhtNvMMaA&usqp=CAU");
		
		product23.setCategory(mensFootwear);
		mensFootwear.getProductCategory().add(product23);
		
		productsList.add(product23);
		
		Products product24 = new Products();
		product24.setName("Bata Loofer");
		product24.setDescription("This is an iphone");
		product24.setStock(92);
		product24.setPrice(2500);
		product24.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRDhOSvAg-Dl3DU5BAAn9Q47MfD4UhtNvMMaA&usqp=CAU");
		
		product24.setCategory(mensFootwear);
		mensFootwear.getProductCategory().add(product24);
		
		productsList.add(product24);
		
		return productsList;
	}

	@Override
	@Transactional
	public void onApplicationEvent(ContextRefreshedEvent event) {
		productsRepository.saveAll(getProducts());
	}

}
