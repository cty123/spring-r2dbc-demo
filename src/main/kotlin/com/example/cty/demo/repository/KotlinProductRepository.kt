package com.example.cty.demo.repository

import com.example.cty.demo.model.Product
import org.springframework.data.repository.kotlin.CoroutineCrudRepository
import org.springframework.stereotype.Component

@Component
interface KotlinProductRepository: CoroutineCrudRepository<Product, Long> {
}