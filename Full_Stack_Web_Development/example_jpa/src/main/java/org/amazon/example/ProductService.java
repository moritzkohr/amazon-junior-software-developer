package org.amazon.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//TODO 8: Create the ProductService class in src/main/java/org/amazon/example.
//TODO 9: Annotate it with Service annotation
@Service
public class ProductService {
    //TODO 10: Use Autowired annotation for a variable of type ProductRepository.
    @Autowired
    private ProductRepository productRepository;

    //TODO 11: Implement save(), findAll(), findById() and deleteById() methods.
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public Product updateProduct(Long id, Product updatedProduct) {
        return productRepository.findById(id).map(product -> {
            product.setName(updatedProduct.getName());
            product.setPrice(updatedProduct.getPrice());
            return productRepository.save(product);
        }).orElse(null);
    }

    public void deleteProductById(Long id) {
        productRepository.deleteById(id);
    }
}
