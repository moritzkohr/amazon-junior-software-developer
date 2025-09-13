package org.amazon.example;

import org.springframework.data.jpa.repository.JpaRepository;

//TODO 6: Create ProductRepository interface in src/main/java/org/amazon/example.
//TODO 7: Let the interface extend from the JpaRepository interface.
public interface ProductRepository extends JpaRepository<Product, Long> {

}
