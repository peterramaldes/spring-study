package com.peterramaldes.models;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Table
public class Customer {
    @Id
    private Long id;
}
