package com.example.Tuan3.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages = "com/example/Tuan3/Model/KhoaHocRepository.java")
@EnableTransactionManagement
public class JpaConfig {
}
