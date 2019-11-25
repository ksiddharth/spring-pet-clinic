package guru.spring.petclinic.service.map;

import guru.spring.petclinic.model.Owner;
import guru.spring.petclinic.service.OwnerService;
import guru.spring.petclinic.service.PetService;
import guru.spring.petclinic.service.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    private PetService petService;
    private PetTypeService petTypeService;

    OwnerServiceMap(PetService petService, PetTypeService petTypeService) {
        this.petService = petService;
        this.petTypeService = petTypeService;
    }

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
        if (owner != null) {
            if (owner.getPets() != null ) {
                owner.getPets().forEach( pet -> {
                    if(pet.getType() != null) {
                        if (pet.getType().getId() == null) {
                            pet.setType(this.petTypeService.save(pet.getType()));
                        }
                    } else {
                        throw new RuntimeException("Pet Type is required");
                    }
                    if(pet.getId() != null) {
                        pet.setId(petService.save(pet).getId());
                    }
                });
            }
            return super.save(owner);
        } else {
            return null;
        }
    }

    @Override
    public void deleteObject(Owner owner) {
        super.deleteByObject(owner);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
