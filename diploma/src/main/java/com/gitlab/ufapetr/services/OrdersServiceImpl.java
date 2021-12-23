package com.gitlab.ufapetr.services;

import com.gitlab.ufapetr.forms.OrderForm;
import com.gitlab.ufapetr.models.Order;
import com.gitlab.ufapetr.repositories.CustomersRepository;
import com.gitlab.ufapetr.repositories.OrdersRepository;
import com.gitlab.ufapetr.repositories.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class OrdersServiceImpl implements OrdersService {

    private final OrdersRepository ordersRepository;
    private final CustomersRepository customersRepository;
    private final ProductsRepository productsRepository;
    @Autowired
    public OrdersServiceImpl(OrdersRepository ordersRepository, CustomersRepository customersRepository, ProductsRepository productsRepository) {
        this.ordersRepository = ordersRepository;
        this.customersRepository = customersRepository;
        this.productsRepository = productsRepository;
    }

    @Override
    public void addOrder(OrderForm form) {
        Order order = Order.builder()
                .customer(form.getCustomer())
                .product(form.getProduct())
                .order_date(form.getOrder_date())
                .quantity(form.getQuantity())
                .build();

        ordersRepository.save(order);
    }

    @Override
    public List<Order> getAllOrders() {
        return ordersRepository.findAll();
    }

    @Override
    public List<Order> findByIdProduct(String productId) {
        return null;
    }

    @Override
    public List<Order> findByIdCustomer(String customerId) {
        return null;
    }

    @Override
    public void deleteOrder(Integer id) {
        ordersRepository.deleteById(id);
    }

    @Override
    public Order getOrder(Integer id) {
        return ordersRepository.getById(id);
    }

    @Override
    public void updateOrder(Integer id, OrderForm form) {
        Order order = ordersRepository.getById(id);

        order.setOrder_date(form.getOrder_date());
        order.setQuantity(form.getQuantity());
        order.setCustomer(form.getCustomer());
        order.setProduct(form.getProduct());
        ordersRepository.save(order);
    }
}
