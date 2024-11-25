package com.example.rest.repository;

public class Repository {
    Products products;

    public Repository() {
        products = new PostgresProductRepository();
    }
}
