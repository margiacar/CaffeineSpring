package org.example;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CustomerRepository {
    private final Map<String, Customer> customerMap = new HashMap<>();

    public Customer put(Customer customer){
        System.out.println("REPOSITORY - Call put");
        customerMap.put(customer.getId(), customer);
        return customer;
    }

    public Customer get(String name){
        System.out.println("REPOSITORY - Call get");
        return customerMap.get(name);
    }
}
