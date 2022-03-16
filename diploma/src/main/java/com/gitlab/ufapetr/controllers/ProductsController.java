package com.gitlab.ufapetr.controllers;

import com.gitlab.ufapetr.forms.ProductForm;
import com.gitlab.ufapetr.models.Product;
import com.gitlab.ufapetr.services.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@Slf4j
public class ProductsController {

    @Autowired
    private final ProductService productService;

    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public String getProducts(){
        //получаем список автомобилей
        System.out.println("Получен список автомобилей");
        return "redirect:/products.html";
    }

    @GetMapping ("products_list")
    public String getProductsList(Model model){
        //получаем список автомобилей
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);
        System.out.println("Получен список автомобилей");
        return "products_list";
    }

    @GetMapping ("product/{product-id}")
    public String getProductPage(Model model,@PathVariable("product-id") Integer product_id){
        Product product = productService.getProduct(product_id);
        model.addAttribute("product", product);
        log.info("Вывод списка заказов ");
        return "product";
    }

    @PostMapping("/products")
    public String addProduct(ProductForm productForm){
        //Создаем продукт-автомобиль
        productService.addProduct(productForm);
        log.info("Добавлен автомобиль {}", productForm.toString());
        return ("redirect:/products.html");
    }

    @PostMapping("products/{product-id}/delete")
    public String deleteProduct(@PathVariable ("product-id") Integer product_id){
        productService.deleteProduct(product_id);
        return "redirect:/products_list";
    }

    @PostMapping("products/{product-id}/update")
    public String updateProduct(@PathVariable("product-id") Integer productId, ProductForm form){
        productService.updateProduct(productId, form);
        return "redirect:/products_list";
    }

}
