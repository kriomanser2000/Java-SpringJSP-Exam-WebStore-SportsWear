package com.example.javaexamwebstoresportswear.services;

import com.example.javaexamwebstore.models.Category;
import com.example.javaexamwebstore.repositories.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService
{
    private final CategoryRepository categoryRepository;
    public CategoryService(CategoryRepository categoryRepository)
    {
        this.categoryRepository = categoryRepository;
    }
    public List<Category> getAllCategories()
    {
        return categoryRepository.findAll();
    }
    public void saveCategory(Category category)
    {
        categoryRepository.save(category);
    }
    public void deleteCategory(Long id)
    {
        categoryRepository.deleteById(id);
    }
}
