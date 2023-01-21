package com.peterramaldes.controllers;

import com.peterramaldes.models.Customer;
import com.peterramaldes.repositories.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerRepository repository;

    @GetMapping
    List<Customer> listAll() {
        return (List<Customer>) repository.findAll();
    }

    @PostMapping
    Customer save(@RequestBody Customer customer) {
        return repository.save(customer);
    }

}
