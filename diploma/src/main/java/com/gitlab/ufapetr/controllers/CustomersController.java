package com.gitlab.ufapetr.controllers;

import com.gitlab.ufapetr.forms.CustomerForm;
import com.gitlab.ufapetr.models.Customer;
import com.gitlab.ufapetr.repositories.CustomersRepository;
import com.gitlab.ufapetr.services.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class CustomersController {

    private final CustomersService customersService;

    @Autowired
    public CustomersController(CustomersService customersService) {
        this.customersService = customersService;
    }

    @GetMapping ("/customers")
    public String getCustomers(){
        //Добавление пользователей
        System.out.println("Страница добавления пользователя");
        return "customers";
    }

    @GetMapping ("/customers_list")
    public String getCustomersList(Model model){
        //получаем пользователей
        List<Customer> customers = customersService.getAllCustomers();
        model.addAttribute("customers", customers);
        System.out.println("Получен список пользователей");
        return "customers_list";
    }

    @GetMapping ("/customer/{customer-id}")
    public String getCustomerPage(Model model,@PathVariable("customer-id") Integer customer_id){
        Customer customer = customersService.getCustomer(customer_id);
        model.addAttribute("customer", customer);
        return "customer";
    }

    @PostMapping ("/customers")
    public String addCustomer(CustomerForm form){
        //создаем пользователя
        customersService.addCustomer(form);
        System.out.println("Добавлен пользователь с Именем " + form.getName());
        return "redirect:/customers_list";
    }

    @PostMapping("customers/{customer-id}/delete")
    public String deleteCustomer(@PathVariable ("customer-id") Integer customerId){
        customersService.deleteCustomer(customerId);
        return "redirect:/customers_list";
    }

    @PostMapping("customers/{customer-id}/update")
    public String updateCustomer(@PathVariable("customer-id") Integer customerId, CustomerForm form){
        customersService.updateCustomer(customerId, form);
        return "redirect:/customers_list";
    }

}
