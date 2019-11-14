package guru.spring.petclinic.service;

import guru.spring.petclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet getByID(Long id);
    Set<Vet> getAll();
    Vet save(Vet vet);
}
