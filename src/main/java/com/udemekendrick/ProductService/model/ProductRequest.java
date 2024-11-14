package com.udemekendrick.ProductService.model;

import lombok.Data;

@Data
public class ProductRequest {

    private String productName;
    private double price;
    private long quantity;
}
