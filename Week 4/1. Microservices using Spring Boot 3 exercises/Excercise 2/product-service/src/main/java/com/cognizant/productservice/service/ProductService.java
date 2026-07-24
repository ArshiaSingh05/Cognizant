package com.cognizant.productservice.service;

import com.cognizant.productservice.entity.Product;
import com.cognizant.productservice.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    public Product save(Product product) {
        return repository.save(product);
    }
}