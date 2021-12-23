package com.gitlab.ufapetr.controllers;

import com.gitlab.ufapetr.forms.OrderForm;
import com.gitlab.ufapetr.models.Customer;
import com.gitlab.ufapetr.models.Order;
import com.gitlab.ufapetr.models.Product;
import com.gitlab.ufapetr.services.CustomersService;
import com.gitlab.ufapetr.services.OrdersService;
import com.gitlab.ufapetr.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class OrdersController {
    private final OrdersService ordersService;
    private final ProductService productService;
    private final CustomersService customersService;

    @Autowired
    public OrdersController(OrdersService ordersService, ProductService productService, CustomersService customersService) {
        this.ordersService = ordersService;
        this.productService = productService;
        this.customersService = customersService;
    }

    @GetMapping("/orders_list")
    public String getOrdersList(Model model) {

        //получаем список пользователей
        List<Customer> customers = customersService.getAllCustomers();
        Map<Integer, String> customersDescription = new HashMap<>();

        for (Customer c : customers
        ) {
            customersDescription.put(c.getId(), c.getName());
        }

        model.addAttribute("customers", customersDescription);

        //получаем список автомобилей
        List<Product> products = productService.getAllProducts();
        Map<Integer, String> productsDescription = new HashMap<>();

        for (Product p : products
        ) {
            productsDescription.put(p.getId(), p.getDescription());
        }

        model.addAttribute("products", productsDescription);

        //получаем список покупок
        List<Order> orders = ordersService.getAllOrders();
        model.addAttribute("orders", orders);
        System.out.println("Получен список автомобилей");

        return "orders_list";
    }

    @GetMapping("/order/{order-id}")
    public String getOrderPage(Model model, @PathVariable("order-id") Integer id) {
        Order order = ordersService.getOrder(id);
        model.addAttribute("order", order);
        return "order";
    }

    @PostMapping("/addorders")
    public String addOrder(OrderForm orderForm) {
        //Добавляем заказ
        java.sql.Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());
        orderForm.setProduct(productService.getProduct(orderForm.getProduct_id()));
        orderForm.setCustomer(customersService.getCustomer(orderForm.getCustomer_id()));
        orderForm.setOrder_date(date);
        ordersService.addOrder(orderForm);
        System.out.println("Добавлен новый заказ ");
        return ("redirect:/orders_list");
    }

    @PostMapping("orders/{order-id}/delete")
    public String deleteOrder(@PathVariable("order-id") Integer order_id) {
        ordersService.deleteOrder(order_id);
        return "redirect:/orders_list";
    }

    @PostMapping("orders/{order-id}/update")
    public String updateOrder(@PathVariable("order-id") Integer order_id, OrderForm form) {
        ordersService.updateOrder(order_id, form);
        return "redirect:/orders_list";
    }
}
