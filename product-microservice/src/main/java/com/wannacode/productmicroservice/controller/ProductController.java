package com.wannacode.productmicroservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;

import com.wannacode.productmicroservice.repository.ProductRepository;
import com.wannacode.productmicroservice.entity.ProductEntity;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    
    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductEntity> getAllProducts() {
        return productRepository.findAll();
    }

/*     @GetMapping
    public ResponseEntity<List<ProductEntity>> getAllProduct() {
        List<ProductEntity> productEntities = productRepository.findAll();
        ResponseEntity<List<ProductEntity>> responseEntity = new ResponseEntity<>(productEntities, HttpStatus.OK);
        return responseEntity;
    } */

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void createProduct(@RequestBody ProductEntity productEntity) {
        productRepository.save(productEntity);
    }
}
