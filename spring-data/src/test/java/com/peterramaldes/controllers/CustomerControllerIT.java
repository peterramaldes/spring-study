package com.peterramaldes.controllers;

import com.peterramaldes.models.Customer;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class CustomerControllerIT {

    @Autowired
    private CustomerController controller;

    @Test
    void listAll() {
        List<Customer> customers = controller.listAll();
        assertNotNull(customers);
    }

    @Test
    void save() {
    }
}