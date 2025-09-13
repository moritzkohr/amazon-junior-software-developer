package com.example.ecommerce;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

//    TODO 23: In src/main/java/com/example/ecommerce, create a new class called PasswordConfig. Define a PasswordEncoder bean using BCryptPasswordEncoder.
@Configuration
public class PasswordConfig {
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
