package com.example.javaexamwebstoresportswear.contoller;

import com.example.javaexamwebstore.models.User;
import com.example.javaexamwebstore.services.UserService;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController
{
    private final UserService userService;
    public UserController(UserService userService)
    {
        this.userService = userService;
    }
    @GetMapping("/user/profile")
    public String userProfile(Model model, Authentication authentication)
    {
        String email = authentication.getName();
        User user = userService.findByEmail(email);
        model.addAttribute("user", user);
        return "profile";
    }
    @PostMapping("/user/profile")
    public String updateUserProfile(User updatedUser, Authentication authentication)
    {
        String email = authentication.getName();
        userService.updateUser(email, updatedUser);
        return "redirect:/user/profile";
    }
}