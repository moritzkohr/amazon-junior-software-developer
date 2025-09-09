package com.quickcart.ecommerce.controller;

import com.quickcart.ecommerce.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

// TODO 4: add the @Controller annotation to declare the class as a controller
@Controller
public class ProductController {
    //TODO 5: create a public method named getProducts that accepts a Model object as argument and returns a String representing the view name
        // TODO 5a: add the @GetMapping annotation with the value "/products" to map the method to the URL "/products"
    @GetMapping({"/","/products"})
    public String getProducts(Model productModel){
        // TODO 6: declare a List of Product objects and initialize it with an empty ArrayList
        List<Product> products = new ArrayList<>();

        // TODO 7: create three new Product objects, namely, Laptop, Smartphone, and Headphones with details
        Product laptop = new Product(1, "Lenovo Laptop", "Lenovo Laptop with 16 GB RAM", 500.0);
        Product smartphone = new Product(2, "Samsung Smartphone", "Samsung Smartphone with 8 GB RAM", 300.0);
        Product headphones = new Product(3, "Sony Headphones", "Sony Headphones with 3.5 inch Speaker", 100.0);

        // TODO 8: add the three Product objects to the List of products
        products.add(laptop);
        products.add(smartphone);
        products.add(headphones);

        // TODO 9: add the List of products to the Model object with the key "products"
        productModel.addAttribute("products", products);

        // TODO 10: return the view name "products" as a String
        return "products";
    }

}
