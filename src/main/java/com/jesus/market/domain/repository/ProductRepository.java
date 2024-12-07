package com.jesus.market.domain.repository;

import com.jesus.market.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<Product> getAll();
    Optional<List<Product>> getByCategory(int categoryId);
    Optional<List<Product>> getSacerseProducts(int quantity);
    Optional<List<Product>> getProducts(int productId);
    Product save(Product product);
    void delete(int productId);



}
