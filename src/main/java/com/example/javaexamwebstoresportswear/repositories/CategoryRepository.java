package com.example.javaexamwebstoresportswear.repositories;

import com.example.javaexamwebstore.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>
{
}