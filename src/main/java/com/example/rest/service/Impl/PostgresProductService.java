package com.example.rest.service.Impl;

import com.example.rest.model.Product;
import com.example.rest.repository.PostgresProductRepository;
import com.example.rest.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PostgresProductService implements ProductService {
    private final PostgresProductRepository repository;

    @Override
    public Product Create(Product product) {
        return repository.Create(product);
    }

    @Override
    public Product Update(Product product) {
        return repository.Update(product);
    }

    @Override
    public Product Delete(int id) {
        return repository.Delete(id);
    }

    @Override
    public Product GetById(int id) {
        return repository.GetById(id);
    }

    @Override
    public List<Product> GetAll() {
        return repository.GetAll();
    }
}
