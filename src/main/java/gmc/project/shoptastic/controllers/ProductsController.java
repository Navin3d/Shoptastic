package gmc.project.shoptastic.controllers;

import gmc.project.shoptastic.services.ProductsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ProductsController {

    private final ProductsService productsService;

    public ProductsController(ProductsService productsService) {
        this.productsService = productsService;
    }

    @GetMapping("product/{id}/show")
    public String productDetailedView(@PathVariable String id, Model model) {
        model.addAttribute("product", productsService.findProduct(Long.valueOf(id)));
        return "products/productview";
    }

}
