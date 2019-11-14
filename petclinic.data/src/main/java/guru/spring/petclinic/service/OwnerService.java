package guru.spring.petclinic.service;

import guru.spring.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
     Owner getByID(Long id);
     Set<Owner> getAll();
     Owner save(Owner owner);
     Owner findByLastName(String lastName);
}
