package com.microservices.productservice.repository;

import com.microservices.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDAO extends MongoRepository<Product, String> {
}
