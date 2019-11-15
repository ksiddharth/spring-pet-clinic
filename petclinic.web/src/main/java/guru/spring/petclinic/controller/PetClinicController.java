package guru.spring.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PetClinicController {

    @RequestMapping({"", "/", "index", "index.html"})
    public String indexHandler(Model model) {
        return "index";
    }
}
