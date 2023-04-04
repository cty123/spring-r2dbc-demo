package com.example.cty.demo.adapter

import com.example.cty.demo.model.Product
import com.example.cty.demo.repository.KotlinProductRepository
import kotlinx.coroutines.flow.Flow
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("kotlin")
class KotlinController(val kotlinProductRepository: KotlinProductRepository) {

    @GetMapping("/async")
    suspend fun blocking(): Product? {
        return kotlinProductRepository.findById(123)
    }

    @GetMapping("/asyncList")
    suspend fun blockList(): Flow<Product> {
        return kotlinProductRepository.findAll()
    }
}