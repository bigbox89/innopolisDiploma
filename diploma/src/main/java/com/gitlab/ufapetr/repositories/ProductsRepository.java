package com.gitlab.ufapetr.repositories;

import com.gitlab.ufapetr.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductsRepository extends JpaRepository<Product, Integer> {
    List<Product> findAll();
}
