package com.intiformation.ecommerce.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.intiformation.ecommerce.entity.Categorie;
import com.intiformation.ecommerce.service.IAdminCategoriesService;

@Controller
@RequestMapping("/categories")
public class AdminCategoriesController extends AbstractController {

	private IAdminCategoriesService categorieService;

	/**
	 * ctor pour injection spring
	 * 
	 * @param boutiqueService
	 */
	public AdminCategoriesController(IAdminCategoriesService categorieService) {
		super();
		this.categorieService = categorieService;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * cree la liste des categories pour la view 'categorieList'
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String index(Model model) {
		// 1.cree une liste de categories
		List<Categorie> categories = java.util.Collections.emptyList();

		// 2. recup liste des categories
		categories = categorieService.getListCategories();

		// 3.
		model.addAttribute("categoriesAttribute", categories);

		// renvoie le nom de la vue
		return "categorieList";
	}

}
