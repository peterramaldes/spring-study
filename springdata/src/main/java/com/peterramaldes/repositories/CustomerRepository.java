package com.peterramaldes.repositories;

import com.peterramaldes.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
