package com.example.ecommerce;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//TODO 32: In src/main/java/com/example/ecommerce, create a class called ProductController.
//TODO 33: Annotate ProductController with @Controller and add the base request mapping /products.
@Controller
@RequestMapping("/products")
public class ProductController {
    //TODO 34: Inject ProductService into ProductController.
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    //TODO 35: Create the following endpoints in ProductController
    //    GET /products: Displays all products.
    //    GET /products/add: Displays the form for adding a product.
    //    POST /products/add: Saves a new product.

    @GetMapping
    public String listProducts(Model model){
        model.addAttribute("products",productService.getAllProducts());
        return "products";
    }

    @GetMapping("/add")
    public String showAddForm(Model model){
        model.addAttribute("product",new Product());
        return "product-form";
    }

    @PostMapping("/add")
    public String addProduct(@ModelAttribute Product product){
        productService.addProduct(product);
        return "redirect:/products";
    }
}
