package com.gitlab.ufapetr.repositories;

import com.gitlab.ufapetr.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomersRepository extends JpaRepository<Customer,Integer> {
    List<Customer> findAll();
}
