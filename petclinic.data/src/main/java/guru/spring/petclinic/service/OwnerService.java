package guru.spring.petclinic.service;

import guru.spring.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
     Owner findByLastName(String lastName);
}
