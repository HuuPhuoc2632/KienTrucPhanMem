package com.example.Tuan3;

import com.example.Tuan3.Model.KhoaHoc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

@EnableAutoConfiguration
@ComponentScan
@SpringBootApplication
@ComponentScan(basePackages = "com.example.Tuan3.service")
@EnableJpaRepositories("com.example.Tuan3.Model")
public class Tuan3Application {
	public static void main(String[] args) {
		SpringApplication.run(Tuan3Application.class, args);
	}

}
