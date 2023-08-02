package com.microservices.productservice.service;

import com.microservices.productservice.dto.ProductRequest;
import com.microservices.productservice.model.Product;
import com.microservices.productservice.repository.ProductDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

import static java.util.UUID.randomUUID;

@Service
public class ProductService {


    @Autowired
    ProductDAO productDAO;

    public void insertProduct(ProductRequest productRequest) {
        final String productId =  UUID.randomUUID().toString();
        Product insertProduct = Product.builder().id(productId)
                        .name(productRequest.getName())
                                .description(productRequest.getDescription())
                                        .price(productRequest.getPrice())
                                                .build();
        productDAO.save(insertProduct);

    }
}
