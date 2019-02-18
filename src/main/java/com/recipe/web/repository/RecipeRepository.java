package com.recipe.web.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.recipe.web.model.RecipeBean;

public interface RecipeRepository extends JpaRepository<RecipeBean, UUID>{


}
