package com.gitlab.ufapetr.services;

import com.gitlab.ufapetr.forms.ProductForm;
import com.gitlab.ufapetr.models.Customer;
import com.gitlab.ufapetr.models.Product;
import com.gitlab.ufapetr.repositories.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ProductServiceImpl implements ProductService{
    private final ProductsRepository productsRepository;

    @Autowired
    public ProductServiceImpl(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    @Override
    public void addProduct(ProductForm form) {

        Product product = Product.builder()
                .description(form.getDescription())
                .price(form.getPrice())
                .quantity(form.getQuantity())
                .build();

        productsRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productsRepository.findAll();
    }

    @Override
    public void deleteProduct(Integer productId) {
        productsRepository.deleteById(productId);
    }

    @Override
    public Product getProduct(Integer product_id) {
        return productsRepository.getById(product_id);
    }

    @Override
    public void updateProduct(Integer productId, ProductForm form) {
        Product product = productsRepository.getById(productId);
        product.setDescription(form.getDescription());
        product.setPrice(form.getPrice());
        product.setQuantity(form.getQuantity());
        productsRepository.save(product);
    }
}
