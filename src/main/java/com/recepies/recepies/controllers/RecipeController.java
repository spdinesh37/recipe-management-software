package com.recepies.recepies.controllers;

import com.recepies.recepies.services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.recepies.recepies.entities.Recipe;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/recipes")
public class RecipeController {

    @Autowired
    private RecipeService recipeService;

    // Get all recipes
    @GetMapping
    public List<Recipe> getAllRecipes() {
        return recipeService.getAllRecipes();
    }

//    // Get recipe by ID
//    @GetMapping("/{id}")
//    public Optional<Recipe> getRecipeById(@PathVariable Long id) {
//        return recipeService.getRecipeById(id);
//    }

    // Create a new recipe
    @PostMapping
    public Recipe createRecipe(@RequestBody Recipe recipe) {
        return recipeService.createOrUpdateRecipe(recipe);
    }

    // Update an existing recipe
    @PutMapping("/{id}")
    public Recipe updateRecipe(@PathVariable Long id, @RequestBody Recipe recipe) {
        return recipeService.createOrUpdateRecipe(recipe);
    }

    // Delete a recipe by ID
    @DeleteMapping("/{id}")
    public void deleteRecipe(@PathVariable Long id) {
        recipeService.deleteRecipe(id);
    }
}
