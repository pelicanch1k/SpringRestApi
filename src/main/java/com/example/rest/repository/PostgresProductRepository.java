package com.example.rest.repository;

import com.example.rest.model.Product;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PostgresProductRepository implements Products{
    private static final String URL = "jdbc:postgresql://localhost:5433/postgres";
    private static final String USER = "postgres";
    private static final String PASSWORD = "root";

    @Override
    public Product Create(Product product) {
        return null;
    }

    @Override
    public Product Update(Product product) {
        return null;
    }

    @Override
    public Product Delete(int id) {
        return null;
    }

    @Override
    public Product GetById(int id) {
        return null;
    }

    @Override
    public List<Product> GetAll() {
        List<Product> products = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);


             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM products");) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int price = resultSet.getInt("price");

                products.add(Product.builder().name(name).id(id).price(price).build());
            }

            return products;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
