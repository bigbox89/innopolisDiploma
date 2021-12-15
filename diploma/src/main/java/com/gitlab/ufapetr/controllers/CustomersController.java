package com.gitlab.ufapetr.controllers;

import com.gitlab.ufapetr.models.Customer;
import com.gitlab.ufapetr.repositories.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class CustomersController {
    //DI
    @Autowired
    private CustomersRepository repository;

    @GetMapping ("/customers")
    public String getCustomers(){
        //получаем пользователей
        System.out.println("Получен список пользователей");
        return "redirect:/customers.html";
    }

    @PostMapping ("/customers")
    public String addCustomer(@RequestParam("name") String name){
        //создаем пользователя
        Customer customer = Customer.builder()
                .name(name).build();

        repository.save(customer);
        System.out.println("Добавлен пользователь с Именем " + name);
        return "redirect:/customers.html";
    }
}
