package com.recepies.recepies.repos;

import com.recepies.recepies.entities.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  RecipeRepository extends JpaRepository<Recipe, Long> {

}
