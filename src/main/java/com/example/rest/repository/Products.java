package com.example.rest.repository;

import com.example.rest.model.Product;

import java.util.List;

public interface Products {
    Product Create(Product product);
    Product Update(Product product);
    Product Delete(int id);
    Product GetById(int id);
    List<Product> GetAll();
}
