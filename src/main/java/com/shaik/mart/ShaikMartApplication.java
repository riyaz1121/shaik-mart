package com.shaik.mart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@SpringBootApplication
@RestController
public class ShaikMartApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShaikMartApplication.class, args);
    }

    @GetMapping("/")
    public Map<String, Object> home() {
        return Map.of(
            "store", "Shaik Mart",
            "message", "Welcome to Shaik Mart!",
            "description", "Your personalized online shopping store",
            "products", "/api/products",
            "health", "/health"
        );
    }

    @GetMapping("/api/products")
    public List<Map<String, Object>> products() {
        return List.of(
            Map.of("id", 1, "name", "Wireless Headphones", "price", 1499),
            Map.of("id", 2, "name", "Smart Watch", "price", 2499),
            Map.of("id", 3, "name", "Travel Backpack", "price", 999),
            Map.of("id", 4, "name", "Bluetooth Speaker", "price", 1299)
        );
    }

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of("status", "UP", "application", "Shaik Mart");
    }
}
