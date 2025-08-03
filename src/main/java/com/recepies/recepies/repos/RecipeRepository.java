package com.recepies.recepies.repos;

import com.recepies.recepies.entities.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface  RecipeRepository extends JpaRepository<Recipe, Long> {

    @Modifying
    @Transactional
    @Query(value = "DROP TABLE IF EXISTS recipe", nativeQuery = true)
    void dropRecipeTable();

}
