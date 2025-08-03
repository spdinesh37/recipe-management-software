package com.recepies.recepies.services;

import com.recepies.recepies.entities.Recipe;
import com.recepies.recepies.repos.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecipeService {

    @Autowired
    private RecipeRepository recipeRepository;

    // Get all recipes
    public List<Recipe> getAllRecipes() {
        return recipeRepository.findAll();
    }

    // Get a recipe by ID
    public Optional<Recipe> getRecipeById(Long id) {
        return recipeRepository.findById(id);
    }

    // Create or update a recipe
    public Recipe createOrUpdateRecipe(Recipe recipe) {
        return recipeRepository.save(recipe);
    }

    // Delete a recipe by ID
    public void deleteRecipe(Long id) {
        recipeRepository.deleteById(id);
    }

    public void deleteTable()
    {
        recipeRepository.dropRecipeTable();
    }


}
