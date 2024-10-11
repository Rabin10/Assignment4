package com.example.Assignment4.Animals;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    public List<Animal> getAllAnimals() {
        return animalRepository.findAll();
    }

    public Animal getAnimalById(int id) {
        return animalRepository.findById(id).orElse(null);
    }

    public Animal addAnimal(Animal animal) {
        return animalRepository.save(animal);
    }

    public Animal updateAnimal(Animal animal) {
        return animalRepository.save(animal);
    }

    public void deleteAnimal(int id) {
        animalRepository.deleteById(id);
    }

    public List<Animal> getAnimalsBySpecies(String species) {
        return animalRepository.findBySpecies(species);
    }

    public List<Animal> searchByName(String name) {
        return animalRepository.findByNameContaining(name);
    }
}
