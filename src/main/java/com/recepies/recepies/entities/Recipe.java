package com.recepies.recepies.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "recipe_name", nullable = false, length = 100)
    private String name;  // Mapping "name" to "recipe_name" in the DB

    @Column(name = "recipe_description", length = 500)
    private String description;

    @Column(name = "cook_time", nullable = true)
    private Integer cookTime;
}
