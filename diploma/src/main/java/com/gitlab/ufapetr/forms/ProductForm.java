package com.gitlab.ufapetr.forms;

import lombok.Data;

@Data
public class ProductForm {
    String description;
    Double price;
    Integer quantity;
}
