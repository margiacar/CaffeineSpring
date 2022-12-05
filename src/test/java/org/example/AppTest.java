package org.example;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

/**
 * Unit test for simple App.
 */
@SpringBootTest
class CacheApplicationTests {

    @Autowired
    private CustomerService customerService;

    @SneakyThrows
    @Test
    void testCache() {
        customerService.put(new Customer("abc0", "rua0"));
        customerService.put(new Customer("abc1", "rua1"));
        customerService.put(new Customer("abc2", "rua2"));

        IntStream.rangeClosed(3, 10).forEach(
            i -> customerService.put(new Customer("abc"+i, "rua"+i))
        );

        IntStream.rangeClosed(0, 10).forEach(
            i -> System.out.println(customerService.get("abc" + i))
        );
    }
}
