package com.seduc_dest1.delivery.controllers;

import com.seduc_dest1.delivery.entities.Food;
import com.seduc_dest1.delivery.repositories.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/foods")
public class FoodController {

    @Autowired
    FoodRepository repository;

    @PostMapping
    public Food cadastrar(@RequestBody Food f) {
        return repository.save(f);
    }

    @GetMapping
    public List<Food> mostrar() {
        return repository.findAll();
    }
}