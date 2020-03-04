package cl.com.wastingmagic.HelloSpring;

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
        model.addAttribute("message", message);
        model.addAttribute("greeting", greeting);
        return "index";
    }
}
