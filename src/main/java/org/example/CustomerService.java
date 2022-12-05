package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class CustomerService {

    @Autowired
    private CustomerRepository repository;

    @CachePut(value = "customer", key = "#customer.id")
    public Customer put(Customer customer){
        return repository.put(customer);
    }

    @Cacheable(value = "customer")
    public Customer get(String name){
        var customer = repository.get(name);
        customer.setName(customer.getName() + "[not cached");
        return customer;
    }
}
