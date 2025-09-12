package com.coffeeshop.menu.service;

import com.coffeeshop.menu.model.Product;
import com.coffeeshop.menu.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;
    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
    @Override
    public void saveProduct(Product product) {
        this.productRepository.save(product);
    }

    //TODO 2: create a method signature in the ProductServiceImpl class with @override annotation, return type, and method argument.
    @Override
    public Product getProductById(int id) {
        //TODO 3: JpaRepositories findById() method returns an Optional Object of type Product
        Optional<Product> optional = productRepository.findById(id);
        //TODO 4: delare a null product object.
        Product p = null;
        //TODO 5: use the if-else block to see if any product record is returned or not
        if(optional.isPresent()) {
            //TODO 6: if the product is returned then assign to product object.
            p = optional.get();
        }else{
            //TODO 7: else throw a Runtime Exception with a relevant message of record not found with that id.
            throw new RuntimeException("Product not found for id: " + id);
        }
        return p;
    }

    //TODO 20: in the ProductService class add the deleteById() method from JpaRepository
    @Override
    public void deleteProductById(int id) {
        this.productRepository.deleteById(id);
    }

}
