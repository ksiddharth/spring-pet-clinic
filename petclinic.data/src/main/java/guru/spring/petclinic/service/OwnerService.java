package guru.spring.petclinic.service;

import guru.spring.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerService extends CrudService<Owner, Long> {
     Owner findByLastName(String lastName);
}
