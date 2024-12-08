package com.example.javaexamwebstoresportswear.contoller;

import com.example.javaexamwebstore.models.Product;
import com.example.javaexamwebstore.models.User;
import com.example.javaexamwebstore.services.ProductService;
import com.example.javaexamwebstore.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin")
public class AdminController
{
    private final ProductService productService;
    private final UserService userService;
    public AdminController(ProductService productService, UserService userService)
    {
        this.productService = productService;
        this.userService = userService;
    }
    @GetMapping("/products")
    public String manageProducts(Model model)
    {
        model.addAttribute("products", productService.getAllProducts());
        return "admin/products";
    }
    @GetMapping("/products/new")
    public String newProductForm(Model model)
    {
        model.addAttribute("product", new Product());
        return "admin/product-form";
    }
    @PostMapping("/products")
    public String saveProduct(Product product)
    {
        productService.saveProduct(product);
        return "redirect:/admin/products";
    }
    @GetMapping("/users")
    public String manageUsers(Model model)
    {
        model.addAttribute("users", userService.getAllUsers());
        return "admin/users";
    }
    @PostMapping("/users/block/{id}")
    public String blockUser(@PathVariable Long id)
    {
        userService.blockUser(id);
        return "redirect:/admin/users";
    }
}
