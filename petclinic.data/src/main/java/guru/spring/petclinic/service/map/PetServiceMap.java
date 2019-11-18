package guru.spring.petclinic.service.map;

import guru.spring.petclinic.model.Pet;
import guru.spring.petclinic.service.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long aLong) {
        return super.findByID(aLong);
    }

    @Override
    public Pet save(Pet pet) {
        return super.save(pet);
    }

    @Override
    public void deleteObject(Pet pet) {
        super.deleteByObject(pet);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }
}
