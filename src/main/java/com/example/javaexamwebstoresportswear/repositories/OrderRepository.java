package com.example.javaexamwebstoresportswear.repositories;

import com.example.javaexamwebstore.models.Order;
import com.example.javaexamwebstore.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>
{
    List<Order> findByUser(User user);
}
