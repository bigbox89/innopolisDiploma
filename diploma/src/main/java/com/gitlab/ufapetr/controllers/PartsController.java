package com.gitlab.ufapetr.controllers;

import com.gitlab.ufapetr.forms.PartForm;
import com.gitlab.ufapetr.models.Part;
import com.gitlab.ufapetr.models.Product;
import com.gitlab.ufapetr.services.PartsService;
import com.gitlab.ufapetr.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class PartsController {
    private final PartsService partsService;
    private final ProductService productService;
    @Autowired
    public PartsController(PartsService partsService, ProductService productService) {
        this.partsService = partsService;
        this.productService = productService;
    }

    @GetMapping("/parts")
    public String getParts(){
        //получаем список запчастей
        System.out.println("Получен список запчастей");
        return "redirect:/parts.html";
    }

    @GetMapping ("/parts_list")
    public String getPartsList(Model model){
        //получаем список автомобилей
        List<Product> products = productService.getAllProducts();
        Map <Integer, String> productsDescription = new HashMap<>();

        for (Product p:products
             ) {
            productsDescription.put(p.getId(),p.getDescription());
        }

        model.addAttribute("products", productsDescription);
        //получаем список запчастей
        List<Part> parts = partsService.getAllParts();
        model.addAttribute("parts", parts);
        System.out.println("Получен список запчастей");
        return  "parts_list";
    }

    @GetMapping ("/part/{part-id}")
    public String getPartPage(Model model,@PathVariable("part-id") Integer part_id){
        Part part = partsService.getPart(part_id);
        model.addAttribute("part", part);
        System.out.printf("Вывод списка запчастей ");
        return "part";
    }

    @PostMapping("/parts")
    public String addPart(PartForm partForm){
        //partForm.s(productService.getProduct(partForm.getProduct()));
        partForm.setProduct(productService.getProduct(partForm.getProduct_id()));
        //Создаем продукт-запчасть
        partsService.addPart(partForm);
        //System.out.println("Добавлена запчасть "+ partForm.toString());
        return "redirect:/parts_list";
    }

    @PostMapping("parts/{part-id}/delete")
    public String deletePart(@PathVariable ("part-id") Integer part_id){
        partsService.deletePart(part_id);
        return "redirect:/parts_list";
    }

    @PostMapping("parts/{part-id}/update")
    public String updatePart(@PathVariable("part-id") Integer partId, PartForm form){
        partsService.updatePart(partId, form);
        return "redirect:/parts_list";
    }
}
