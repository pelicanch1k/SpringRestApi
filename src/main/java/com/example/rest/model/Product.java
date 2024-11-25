package com.example.rest.model;

import lombok.*;

@Data
@Builder
public class Product {
    private int id;
    @NonNull
    private String name;
    @NonNull
    private int price;
}
