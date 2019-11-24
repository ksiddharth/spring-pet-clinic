package guru.spring.petclinic.service.map;

import guru.spring.petclinic.model.PetType;
import guru.spring.petclinic.service.PetTypeService;
import net.bytebuddy.implementation.bind.annotation.Super;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetTypeServiceMap extends AbstractMapService <PetType, Long> implements PetTypeService {

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public PetType findById(Long id) {
        return super.findByID(id);
    }

    @Override
    public PetType save(PetType petType) {
        return super.save(petType);
    }

    @Override
    public void deleteObject(PetType petType) {
        super.deleteByObject(petType);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
