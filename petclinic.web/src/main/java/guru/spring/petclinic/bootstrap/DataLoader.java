package guru.spring.petclinic.bootstrap;

import guru.spring.petclinic.model.Owner;
import guru.spring.petclinic.model.Vet;
import guru.spring.petclinic.service.OwnerService;
import guru.spring.petclinic.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("James");
        owner1.setLastName("Hickerson");

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Tyler");
        owner2.setLastName("Durdle");

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
