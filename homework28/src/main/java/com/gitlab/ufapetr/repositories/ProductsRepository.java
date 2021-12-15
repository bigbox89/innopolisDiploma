package com.gitlab.ufapetr.repositories;

import com.gitlab.ufapetr.models.Order;
import com.gitlab.ufapetr.models.Product;

import java.util.List;

public interface ProductsRepository {
    List<Product> findAll();

    List<Product> findAllByPrice(double price);

    // найти все товары по количеству заказов, в которых участвуют
    List<Order> findAllByOrdersCount(int ordersCount);
    void save(Product product);
}
