package cl.com.wastingmagic.HelloSpring;

import cl.com.wastingmagic.HelloSpring.domain.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @Value("${index.greetings}")
    private String greeting;

    @GetMapping("/")
    public String index(Model model) {
        var message = "Ultimate Spring Hello World";
        var person = new Person();

        person.setName("Alejandro");
        person.setLastName("Hernández");
        person.setEmail("+56951064707");
        person.setEmail("Alejandrehl@icloud.com");

        model.addAttribute("message", message);
        model.addAttribute("greeting", greeting);
        model.addAttribute("person", person);

        return "index";
    }
}
