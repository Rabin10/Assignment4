package com.example.Assignment4.Animals;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {

    List<Animal> findBySpecies(String species);

    @Query("SELECT a FROM Animal a WHERE a.name LIKE %:name%")
    List<Animal> findByNameContaining(String name);
}

