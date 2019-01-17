package com.intiformation.ecommerce.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

//import com.intiformation.ecommerce.service;


@Controller
@RequestMapping("/produits")
public class AdminProduitsController extends AbstractController{
	
//	private IBoutiqueService iBoutiqueService;
//	
//	public AdminProduitsController(IBoutiqueService iBoutiqueService) {
//		this.iBoutiqueService =  iBoutiqueService;
//	}
//
//	
//	public String index() {
//		return null;
//	}


	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
