package com.gitlab.ufapetr.forms;

import com.gitlab.ufapetr.models.Product;
import lombok.Data;

@Data
public class PartForm {
    private Integer product_id;
    private Product product;
    private String description;
    private double price;
    private Integer quantity;
}