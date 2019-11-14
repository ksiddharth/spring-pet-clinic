package guru.spring.petclinic.service.map;

import guru.spring.petclinic.model.Owner;
import guru.spring.petclinic.service.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long aLong) {
        return super.findByID(aLong);
    }

    @Override
    public Owner save(Owner owner) {
        return super.save(owner.getId(), owner);
    }

    @Override
    public void deleteObject(Owner owner) {
        super.deleteByObject(owner);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }
}
