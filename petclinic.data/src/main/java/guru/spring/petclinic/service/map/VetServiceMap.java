package guru.spring.petclinic.service.map;

import guru.spring.petclinic.model.Vet;
import guru.spring.petclinic.service.SpecialityService;
import guru.spring.petclinic.service.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    private SpecialityService specialityService;

    public VetServiceMap(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long aLong) {
        return super.findByID(aLong);
    }

    @Override
    public Vet save(Vet vet) {
        if (vet != null) {
            if(vet.getSpecialities() != null && vet.getSpecialities().size()>0){
                vet.getSpecialities().forEach( speciality -> {
                    if(speciality.getId() == null) {
                        speciality.setId(specialityService.save(speciality).getId());
                    }
                });
                return super.save(vet);
            } else {
                throw new RuntimeException("Speciality can't be empty for a vet");
            }

        } else {
            return null;
        }
    }

    @Override
    public void deleteObject(Vet vet) {
        super.deleteByObject(vet);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }
}
