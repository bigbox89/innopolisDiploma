package com.gitlab.ufapetr.controllers;

import com.gitlab.ufapetr.models.Product;
import com.gitlab.ufapetr.repositories.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductsController {

    @Autowired
    private ProductsRepository repository;


    @GetMapping("/products")
    public String getProducts(){
        //получаем список автомобилей
        System.out.println("Получен список автомобилей");
        return "redirect:/products.html";
    }

    @PostMapping("/products")

    public String addProduct(@RequestParam ("description") String description,
                             @RequestParam ("price") Double price,
                             @RequestParam ("quantity") Integer quantity){
        //Создаем продукт-автомобиль
        Product product = Product.builder()
                .description(description)
                .price(price)
                .quantity(quantity)
                .build();

        repository.save(product);
        System.out.println("Добавлен автомобиль "+ product.toString());
        return ("redirect:/products.html");
    }

}
