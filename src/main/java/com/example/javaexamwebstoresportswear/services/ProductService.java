package com.example.javaexamwebstoresportswear.services;

import com.example.javaexamwebstore.models.Product;
import com.example.javaexamwebstore.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService
{
    private final ProductRepository productRepository;
    public ProductService(ProductRepository productRepository)
    {
        this.productRepository = productRepository;
    }
    public List<Product> getAllProducts()
    {
        return productRepository.findAll();
    }
    public Product getProductById(Long id)
    {
        return productRepository.findById(id).orElse(null);
    }
    public void saveProduct(Product product)
    {
        productRepository.save(product);
    }
    public void deleteProduct(Long id)
    {
        productRepository.deleteById(id);
    }
    public List<Product> searchProducts(String name, String brand, String category, Double minPrice, Double maxPrice)
    {
        return productRepository.searchProducts(name, brand, category, minPrice, maxPrice);
    }
}
