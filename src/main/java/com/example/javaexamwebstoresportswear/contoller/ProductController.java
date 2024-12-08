package com.example.javaexamwebstoresportswear.contoller;

import com.example.javaexamwebstore.models.Product;
import com.example.javaexamwebstore.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProductController
{
    private final ProductService productService;
    public ProductController(ProductService productService)
    {
        this.productService = productService;
    }
    @GetMapping("/products")
    public String listProducts(@RequestParam(required = false) String name,
                               @RequestParam(required = false) String brand,
                               @RequestParam(required = false) String category,
                               @RequestParam(required = false) Double minPrice,
                               @RequestParam(required = false) Double maxPrice,
                               Model model)
    {
        List<Product> products = productService.searchProducts(name, brand, category, minPrice, maxPrice);
        model.addAttribute("products", products);
        return "products";
    }
}
