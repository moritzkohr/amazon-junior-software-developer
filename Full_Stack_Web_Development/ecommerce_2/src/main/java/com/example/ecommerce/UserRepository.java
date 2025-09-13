package com.example.ecommerce;


import org.springframework.data.jpa.repository.JpaRepository;

//TODO 20: In src/main/java/com/example/ecommerce, create an interface called UserRepository.
//TODO 21: Extend JpaRepository<User, Long> in the UserRepository.
public interface UserRepository extends JpaRepository<Users, Long> {
    //TODO 22: Add a custom method findByUsername(String username) in UserRepository.
    Users findByUsername(String username);
}
