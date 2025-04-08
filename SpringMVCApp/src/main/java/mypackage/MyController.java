package mypackage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/app")
public class MyController {

    @RequestMapping(path = "/greet", method = RequestMethod.GET)
    public String greetUser(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "greet";
    }

    @RequestMapping(path = "/user/{id}", method = RequestMethod.GET)
    public String getUserById(@PathVariable("id") int id, Model model) {
        model.addAttribute("id", id);
        return "user";
    }

    @RequestMapping(path = "/register", method = RequestMethod.POST)
    public String registerUser(@ModelAttribute("user") User user, Model model) {
        model.addAttribute("user", user); 
        return "registerSuccess";
    }
}
