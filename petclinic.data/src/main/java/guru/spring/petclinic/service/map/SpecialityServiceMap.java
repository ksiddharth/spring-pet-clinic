package guru.spring.petclinic.service.map;

import guru.spring.petclinic.model.Speciality;
import guru.spring.petclinic.service.SpecialityService;

import java.util.Set;

public class SpecialityServiceMap extends AbstractMapService<Speciality, Long> implements SpecialityService {
    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public Speciality findById(Long aLong) {
        return super.findByID(aLong);
    }

    @Override
    public Speciality save(Speciality speciality) {
        return super.save(speciality);
    }

    @Override
    public void deleteObject(Speciality speciality) {
        super.deleteByObject(speciality);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
