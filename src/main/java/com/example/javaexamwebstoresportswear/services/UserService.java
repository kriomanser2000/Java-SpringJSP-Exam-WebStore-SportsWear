package com.example.javaexamwebstoresportswear.services;

import com.example.javaexamwebstore.models.User;
import com.example.javaexamwebstore.repositories.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService
{
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder)
    {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }
    public void registerUser(User user)
    {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole("USER");
        userRepository.save(user);
    }
    public User findByEmail(String email)
    {
        return userRepository.findByEmail(email).orElse(null);
    }
    public void updateUser(String email, User updatedUser)
    {
        Optional<User> existingUser = userRepository.findByEmail(email);
        if (existingUser.isPresent())
        {
            User user = existingUser.get();
            user.setFullName(updatedUser.getFullName());
            user.setCity(updatedUser.getCity());
            user.setCountry(updatedUser.getCountry());
            user.setPhone(updatedUser.getPhone());
            userRepository.save(user);
        }
    }
    public List<User> getAllUsers()
    {
        return userRepository.findAll();
    }
    public void blockUser(Long id)
    {
        Optional<User> user = userRepository.findById(id);
        user.ifPresent(u ->
        {
            u.setRole("BLOCKED");
            userRepository.save(u);
        });
    }
}