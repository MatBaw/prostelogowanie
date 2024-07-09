package com.example.czwarta;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LogowanieController {

    // Przykładowy użytkownik
    private static final User exampleUser = new User("admin", "password");

    @GetMapping("/")
    public String showLoginForm(Model model) {
        model.addAttribute("user", new User());
        return "logowanie";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute User user, Model model) {
        if (exampleUser.getLogin().equals(user.getLogin()) && exampleUser.getPassword().equals(user.getPassword())) {
            return "sukces";
        } else {
            model.addAttribute("error", "Nieprawidłowy login lub hasło");
            return "logowanie";
        }
    }
}
