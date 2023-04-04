package com.example.cty.demo.repository;

import com.example.cty.demo.model.Product;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface JavaProductRepository extends ReactiveCrudRepository<Product, Long> {
}
