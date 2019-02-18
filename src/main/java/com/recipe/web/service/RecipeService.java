package com.recipe.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recipe.web.model.RecipeBean;
import com.recipe.web.repository.RecipeRepository;

@Service
public class RecipeService {
	@Autowired
	private RecipeRepository repository;
	public List<RecipeBean> getRecipies(RecipeBean bean) {
		return repository.findAll();
	}
	
	public RecipeBean addRecipes(RecipeBean bean) {
		 return repository.save(bean);
	}
	
	public RecipeBean getOne(RecipeBean bean) {
		return repository.getOne(bean.getRecipe_id());
	}
}
