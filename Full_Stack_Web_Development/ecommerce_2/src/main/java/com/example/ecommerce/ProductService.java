package com.example.ecommerce;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//TODO 12: In src/main/java/com/example/ecommerce, create a new class called ProductService.
//TODO 13: Annotate ProductService with @Service.
@Service
public class ProductService {
    //TODO 14: Inject the ProductRepository in ProductService and add the following methods:
    //    getAllProducts(): Retrieves all products.
    //    addProduct(Product product): Saves a new product.
    //    getProductById(Long id): Finds a product by ID.
    //    updateProduct(Long id, Product updatedProduct): Updates a product by ID.
    //    deleteProduct(Long id): Deletes a product by ID.
    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product getProductById(Long id){
        return productRepository.findById(id).orElse(null);
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public Product addProduct(Product product){
        return productRepository.save(product);
    }

    public Product updateProduct(Long id, Product updatedProduct){
        return productRepository.findById(id).map(product -> {
            product.setName(updatedProduct.getName());
            product.setPrice(updatedProduct.getPrice());
            product.setDescription(updatedProduct.getDescription());
            return productRepository.save(product);
        }).orElse(null);
    }

    public void deleteProduct(Long id){
        productRepository.deleteById(id);
    }
}
