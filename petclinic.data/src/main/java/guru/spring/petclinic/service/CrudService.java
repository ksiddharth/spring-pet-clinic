package guru.spring.petclinic.service;

import java.util.Set;

public interface CrudService<T, ID> {
    Set<T> findAll();
    T findById(ID id);
    T save(T t);
    T deleteObject(T t);
    T deleteById(ID id);
}
