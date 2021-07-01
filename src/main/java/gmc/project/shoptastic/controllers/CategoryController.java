package gmc.project.shoptastic.controllers;

import gmc.project.shoptastic.domain.Categories;
import gmc.project.shoptastic.services.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import gmc.project.shoptastic.services.ProductsService;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CategoryController {
	
	private final ProductsService productsService;
	private final CategoryService categoryService;

	public CategoryController(ProductsService productsService, CategoryService categoryService) {
		this.productsService = productsService;
		this.categoryService = categoryService;
	}
	
	@GetMapping("/{category}")
	public String getProducts(@PathVariable Categories category, Model model) {
		model.addAttribute("products", categoryService.getCategoryProducts(category));
		return "category/showproducts";
	}

}
