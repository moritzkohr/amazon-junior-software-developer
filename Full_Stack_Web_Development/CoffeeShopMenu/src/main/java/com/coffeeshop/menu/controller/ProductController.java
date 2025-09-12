package com.coffeeshop.menu.controller;

import com.coffeeshop.menu.model.Product;
import com.coffeeshop.menu.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class ProductController {

    @Autowired
    private ProductService productService;

    //display list of products
    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("listProducts", productService.getAllProducts());
        return "menu";
    }
    // This maps to the URL http://localhost:8080/products/
    @GetMapping("/showNewProductForm")
    public String showNewProductForm(Model model) {
        //create model attribute to bind form data
        Product product = new Product();
        model.addAttribute("product", product);
        return "add-new-product";
    }

    @PostMapping("/saveProduct")
    public String saveProduct(@ModelAttribute("product") Product product) {

        //save product to database
        productService.saveProduct(product);
        return "redirect:/";
    }
}
