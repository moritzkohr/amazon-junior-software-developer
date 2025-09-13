package org.amazon.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//TODO 12: Create the ProductController class in src/main/java/org/amazon/example.
//TODO 13: Annotate it with the RestController annotation.
@RestController
public class ProductController {
    //TODO 14: Create a variable of type ProductService and annotate it with Autowired
    @Autowired
    private ProductService productService;

    //TODO 15: Implement the GET, POST, PUT, DELETE, GET(by id) methods in the ProductController class.

    @GetMapping(value = "/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping(value = "/products")
    public Product addProduct(@RequestBody Product product) {
     return productService.addProduct(product);
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    @PutMapping("/products/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product updatedProduct) {
        return productService.updateProduct(id, updatedProduct);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProductById(@PathVariable Long id) {
        productService.deleteProductById(id);
    }
}
