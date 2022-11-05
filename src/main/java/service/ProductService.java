package service;

import score.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProductList();

    void saveOrUpdate(Product product);

    Product getProductById(int id);

    void deleteById(int id);

}