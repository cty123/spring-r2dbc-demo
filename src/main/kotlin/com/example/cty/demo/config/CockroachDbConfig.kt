package com.example.cty.demo.config

import io.r2dbc.spi.ConnectionFactory
import io.r2dbc.spi.ConnectionFactoryOptions.*
import org.springframework.boot.r2dbc.ConnectionFactoryBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.r2dbc.config.AbstractR2dbcConfiguration
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories

@Configuration
@EnableR2dbcRepositories
class CockroachDbConfig : AbstractR2dbcConfiguration() {
    @Bean
    override fun connectionFactory(): ConnectionFactory {
        return ConnectionFactoryBuilder.withOptions(
            builder()
                .option(DRIVER, "postgresql")
                .option(HOST, "cockroach-db")
                .option(PORT, 26257)
                .option(USER, "cockroach")
                .option(DATABASE, "testdb")
        ).build()
    }
}