package org.example;

import lombok.SneakyThrows;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 */
@SpringBootApplication
public class App {
    @SneakyThrows
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
