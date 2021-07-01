package gmc.project.shoptastic.controllers;

import gmc.project.shoptastic.services.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	private final CategoryService categoryService;

	public IndexController(CategoryService categoryService) {
		this.categoryService = categoryService;
	}


	@RequestMapping({"", "/", "/index"})
	public String getIndex(Model model) {
		model.addAttribute("categories", categoryService.getCategory());
		return "index";
	}

}
