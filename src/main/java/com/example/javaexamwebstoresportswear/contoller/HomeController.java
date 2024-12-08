package com.example.javaexamwebstoresportswear.contoller;

import com.example.javaexamwebstore.models.User;
import com.example.javaexamwebstore.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController
{
    private final UserService userService;
    public HomeController(UserService userService)
    {
        this.userService = userService;
    }
    @GetMapping("/")
    public String homePage()
    {
        return "index";
    }
    @GetMapping("/login")
    public String loginPage()
    {
        return "login";
    }
    @GetMapping("/register")
    public String registrationPage(Model model)
    {
        model.addAttribute("user", new User());
        return "register";
    }
    @PostMapping("/register")
    public String registerUser(User user)
    {
        userService.registerUser(user);
        return "redirect:/login";
    }
}
