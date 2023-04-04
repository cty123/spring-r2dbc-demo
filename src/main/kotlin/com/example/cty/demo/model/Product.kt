package com.example.cty.demo.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table(name = "products")
data class Product(
    @Id val productId: Long?,
    val description: String?
)