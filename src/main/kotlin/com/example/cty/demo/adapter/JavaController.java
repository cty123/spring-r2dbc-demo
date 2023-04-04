package com.example.cty.demo.adapter;

import com.example.cty.demo.model.Product;
import com.example.cty.demo.repository.JavaProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("java")
public class JavaController {

    @Autowired
    JavaProductRepository javaProductRepository;

    @GetMapping("/blocking")
    public Product blocking() {
        return javaProductRepository.findById(Long.valueOf(123)).block();
    }

    @GetMapping("/blocking_list")
    public List<Product> blockingList() {
        return javaProductRepository.findAll().collectList().block();
    }

    @GetMapping("/async")
    public Mono<Product> async() {
        return javaProductRepository.findById(Long.valueOf(123));
    }

    @GetMapping("/asyncList")
    public Flux<Product> asyncList() {
        return javaProductRepository.findAll();
    }
}
