package guru.spring.petclinic.service;
import guru.spring.petclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet getByID(Long id);
    Set<Pet> getAll();
    Pet save(Pet pet);
}
