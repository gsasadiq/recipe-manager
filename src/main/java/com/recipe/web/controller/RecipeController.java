package com.recipe.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.recipe.web.model.RecipeBean;
import com.recipe.web.service.RecipeService;

@RestController
public class RecipeController {
	
	ModelAndView view = new ModelAndView();
	
	@Autowired
	private RecipeService service;
	
	@RequestMapping("/home")
	public ModelAndView home() {
		view.setViewName("home");
		return view;
	}
	
	@RequestMapping("/all")
	public List<RecipeBean> getRecipies(RecipeBean bean) {
		return service.getRecipies(bean);
	}
	
	@RequestMapping("/getRecipe")
	public RecipeBean getRecipe(RecipeBean bean) {
		return service.getOne(bean);
	}
	
	
	@PostMapping("/addRecipies")
	public RecipeBean addRecipies(RecipeBean bean) {
		return service.addRecipes(bean);
	}
}
