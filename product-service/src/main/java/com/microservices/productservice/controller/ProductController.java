package com.microservices.productservice.controller;

import com.microservices.productservice.dto.ProductRequest;
import com.microservices.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")
public class ProductController {


    @Autowired
    private ProductService productService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    void createProduct(@RequestBody ProductRequest productRequest) {
        productService.insertProduct(productRequest);
    }
}
