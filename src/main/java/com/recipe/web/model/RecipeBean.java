package com.recipe.web.model;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class RecipeBean implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private UUID recipe_id;
	private String ingredient1;
	private String ingredient12;
	private String ingredient3;
	private String ingredient4;
	
	public RecipeBean() {
		
	}
	public UUID getRecipe_id() {
		return recipe_id;
	}
	public void setRecipe_id(UUID recipe_id) {
		this.recipe_id = recipe_id;
	}
	public String getIngredient1() {
		return ingredient1;
	}
	public void setIngredient1(String ingredient1) {
		this.ingredient1 = ingredient1;
	}
	public String getIngredient12() {
		return ingredient12;
	}
	public void setIngredient12(String ingredient12) {
		this.ingredient12 = ingredient12;
	}
	public String getIngredient3() {
		return ingredient3;
	}
	public void setIngredient3(String ingredient3) {
		this.ingredient3 = ingredient3;
	}
	public String getIngredient4() {
		return ingredient4;
	}
	public void setIngredient4(String ingredient4) {
		this.ingredient4 = ingredient4;
	}
		
	
	
}
