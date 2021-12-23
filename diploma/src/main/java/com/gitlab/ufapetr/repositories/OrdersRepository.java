package com.gitlab.ufapetr.repositories;

import com.gitlab.ufapetr.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrdersRepository extends JpaRepository<Order, Integer> {
    List<Order> findAll();
}
