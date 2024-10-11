package com.example.Assignment4.Animals;
import jakarta.persistence.*;


@Entity // This annotation marks the class as a JPA entity.
public class Animal {

    @Id // Specifies the primary key of the entity.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // The `animalId` will be auto-generated.
    private int animalId;

    private String name;
    private String scientificName;
    private String species;
    private String habitat;
    private String description;

    // Getters and Setters for each attribute to allow access and modification.

    public int getAnimalId() {
        return animalId;
    }

    public void setAnimalId(int animalId) {
        this.animalId = animalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}


