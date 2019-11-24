package guru.spring.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PetClinicController {

    @RequestMapping({"", "/", "index", "index.html"})
    public ModelAndView indexHandler(Model model) {
        ModelAndView mav = new ModelAndView("index");
        return mav;
    }
}