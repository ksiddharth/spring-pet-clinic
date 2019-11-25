package guru.spring.petclinic.bootstrap;

import guru.spring.petclinic.model.Owner;
import guru.spring.petclinic.model.Pet;
import guru.spring.petclinic.model.PetType;
import guru.spring.petclinic.model.Vet;
import guru.spring.petclinic.service.OwnerService;
import guru.spring.petclinic.service.PetTypeService;
import guru.spring.petclinic.service.VetService;
import org.apache.tomcat.jni.Local;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType petType = new PetType();
        petType.setName("Dog");
        PetType dogPetType = petTypeService.save(petType);

        PetType petType2 = new PetType();
        petType.setName("Cat");
        PetType catPetType = petTypeService.save(petType2);

        System.out.println("Loading PetTypes");

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("James");
        owner1.setLastName("Hickerson");
        owner1.setAddress("200 Bakers Street");
        owner1.setCity("Miami");
        owner1.setTelephone("+16547898899");

        Pet pet1 = new Pet();
        pet1.setBirthDate(LocalDate.now());
        pet1.setOwner(owner1);
        pet1.setType(dogPetType);
        pet1.setName("doggy");

        Pet pet2 = new Pet();
        pet2.setBirthDate(LocalDate.now());
        pet2.setOwner(owner1);
        pet2.setType(dogPetType);
        pet2.setName("doggy2");

        owner1.getPets().add(pet1);
        owner1.getPets().add(pet2);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Tyler");
        owner2.setLastName("Durdle");
        owner2.setAddress("201 Bakers Street");
        owner2.setTelephone("+16547898899");
        owner2.setCity("Liami");

        Pet pet3 = new Pet();
        pet3.setBirthDate(LocalDate.now());
        pet3.setOwner(owner2);
        pet3.setType(catPetType);
        pet3.setName("catty");

        Pet pet4 = new Pet();
        pet4.setBirthDate(LocalDate.now());
        pet4.setOwner(owner2);
        pet4.setType(catPetType);
        pet4.setName("catty2");

        owner2.getPets().add(pet3);
        owner2.getPets().add(pet4);

        this.ownerService.save(owner1);
        this.ownerService.save(owner2);

        System.out.println("Loading Owners");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Jumma");
        vet1.setLastName("Dumma");

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Tinga");
        vet2.setLastName("Dunga");

        this.vetService.save(vet1);
        this.vetService.save(vet2);
        System.out.println("Loading Vets");
    }
}
