package com.gitlab.ufapetr.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Order {
    private Integer product_id;
    private Integer customer_id;
    private Date order_date;
    private Integer quantity;
    private String productDescription;
    private Double productPrice;

    public Order( int quantity,  String productDescription, double productPrice) {
        this.quantity = quantity;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
    }

    public Order(int product_id, int customer_id, int quantity) {
        this.product_id = product_id;
        this.customer_id = customer_id;
        this.quantity = quantity;
    }
}
