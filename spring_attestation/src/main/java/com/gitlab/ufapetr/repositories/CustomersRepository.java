package com.gitlab.ufapetr.repositories;

import com.gitlab.ufapetr.models.Customer;

import java.util.List;

public interface CustomersRepository {
    List<Customer> findAll();

    void save(Customer customer);
}
