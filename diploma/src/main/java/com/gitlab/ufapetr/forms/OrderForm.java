package com.gitlab.ufapetr.forms;

import com.gitlab.ufapetr.models.Customer;
import com.gitlab.ufapetr.models.Product;
import lombok.Data;
import java.sql.Date;

@Data
public class OrderForm {
    Integer id;
    private Integer product_id;
    Product product;
    private Integer customer_id;
    Customer customer;
    Date order_date;
    Integer quantity;
}
