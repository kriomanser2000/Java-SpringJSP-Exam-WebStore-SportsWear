package com.example.javaexamwebstoresportswear.services;

import com.example.javaexamwebstoresportswear.dto.UserRegistrationDto;
import com.example.javaexamwebstoresportswear.models.User;
import com.example.javaexamwebstoresportswear.repositories.UserRepository;
import com.example.javaexamwebstoresportswear.services.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService
{

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public User register(UserRegistrationDto registrationDto) {
        if (userRepository.existsByUsername(registrationDto.getUsername())) {
            throw new IllegalArgumentException("Username already exists!");
        }

        User user = new User();
        user.setFullName(registrationDto.getFullName());
        user.setEmail(registrationDto.getEmail());
        user.setUsername(registrationDto.getUsername());
        user.setPassword(passwordEncoder.encode(registrationDto.getPassword()));
        user.setCity(registrationDto.getCity());
        user.setCountry(registrationDto.getCountry());
        user.setPhone(registrationDto.getPhone());

        return userRepository.save(user);
    }
}
