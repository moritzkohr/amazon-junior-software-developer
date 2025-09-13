package com.example.ecommerce;


import org.springframework.data.jpa.repository.JpaRepository;

//    TODO 10: In src/main/java/com/example/ecommerce, create an interface called ProductRepository.
//    TODO 11: Extend JpaRepository<Product, Long> in the ProductRepository to handle CRUD operations.
public interface ProductRepository extends JpaRepository<Product, Long> {
}
