package com.example.Assignment4.Animals;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api/animals")
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @GetMapping
    public List<Animal> getAllAnimals() {
        return animalService.getAllAnimals();
    }

    @GetMapping("/{id}")
    public Animal getAnimalById(@PathVariable int id) {
        return animalService.getAnimalById(id);
    }

    @PostMapping
    public Animal addAnimal(@RequestBody Animal animal) {
        return animalService.addAnimal(animal);
    }

    @PutMapping("/{id}")
    public Animal updateAnimal(@PathVariable int id, @RequestBody Animal animal) {
        animal.setAnimalId(id);  // Set the ID of the animal to be updated
        return animalService.updateAnimal(animal);  // Pass the correct `animal` object to the service
    }

    @DeleteMapping("/{id}")
    public void deleteAnimal(@PathVariable int id) {
        animalService.deleteAnimal(id);
    }

    @GetMapping("/species/{species}")
    public List<Animal> getAnimalsBySpecies(@PathVariable String species) {
        return animalService.getAnimalsBySpecies(species);
    }

    @GetMapping("/search")
    public List<Animal> searchByName(@RequestParam String name) {
        return animalService.searchByName(name);
    }
}
