package com.example.ecommerce;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//TODO 36: In src/main/java/com/example/ecommerce, create a class called ProductRestController.
//TODO 37: Annotate ProductRestController with @Controller and add the base request mapping /products/api.
@RestController
@RequestMapping("/products/api")
public class ProductRestController {
    //TODO 38: Inject ProductService into ProductRestController.
    private final ProductService productService;

    @Autowired
    public ProductRestController(ProductService productService) {
        this.productService = productService;
    }

    //TODO 39: Create the following endpoints in ProductRestController:
    //    GET /products/api: Displays all products.
    //    GET /products/api/id: Displays a product by Id.
    //    POST /products/api: Saves a new product.
    //    DELETE  /products/api/{id}: Deletes an existing product.
    //    PUT  /products/ap/{id}: Updates an existing product.

    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id){
        return productService.getProductById(id);
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product product){
        return productService.updateProduct(id, product);
    }
}
