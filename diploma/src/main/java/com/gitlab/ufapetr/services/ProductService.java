package com.gitlab.ufapetr.services;

import com.gitlab.ufapetr.forms.CustomerForm;
import com.gitlab.ufapetr.forms.ProductForm;
import com.gitlab.ufapetr.models.Product;

import java.util.List;

public interface ProductService {
    void addProduct(ProductForm form);
    List<Product> getAllProducts();

    void deleteProduct(Integer productId);

    Product getProduct(Integer product_id);

    void updateProduct(Integer productId, ProductForm form);
}
