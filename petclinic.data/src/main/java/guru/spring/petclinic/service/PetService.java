package guru.spring.petclinic.service;
import guru.spring.petclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface PetService extends CrudService<Pet, Long> {
}
