package com.gitlab.ufapetr.services;

import com.gitlab.ufapetr.forms.OrderForm;
import com.gitlab.ufapetr.models.Order;

import java.util.List;

public interface OrdersService {
    void addOrder(OrderForm form);
    List<Order>  getAllOrders();
    List<Order> findByIdProduct(String productId);
    List<Order> findByIdCustomer(String customerId);
    void deleteOrder(Integer id);

    Order getOrder(Integer id);

    void updateOrder(Integer id, OrderForm form);
}
