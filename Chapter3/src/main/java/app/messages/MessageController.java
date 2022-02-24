package app.messages;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/messages")
public class MessageController {
    
    @GetMapping("/welcome")
    public String welcom(Model model) {
        model.addAttribute("message", "Hello. welcome to Spring Boot !");

        return "welcome";
    }
}
