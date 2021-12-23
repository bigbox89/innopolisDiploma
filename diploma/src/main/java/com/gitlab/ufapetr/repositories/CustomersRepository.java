package com.gitlab.ufapetr.repositories;

import com.gitlab.ufapetr.models.Customer;
import com.gitlab.ufapetr.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Set;

public interface CustomersRepository extends JpaRepository<Customer,Integer> {
    List<Customer> findAll();

}
