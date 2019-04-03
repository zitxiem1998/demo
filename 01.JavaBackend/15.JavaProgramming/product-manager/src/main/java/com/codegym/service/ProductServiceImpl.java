package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {

    private static Map<Integer, Product> productMap;

    static {
        productMap=new HashMap<>();
        productMap.put(1, new Product(1, "iphone", 200000, "Apple", "Dien thoai"));
        productMap.put(2, new Product(2, "but chi", 20, "Thien long", "Do dung hoc tap"));
        productMap.put(3, new Product(3, "ban hoc", 200, "Go", "Do dung hoc tap"));
        productMap.put(4, new Product(4, "sach", 300, "Kim Dong", "do dung hoc tap"));
        productMap.put(5, new Product(5, "laptop", 20000, "Dell", "do dung dien tu"));
        productMap.put(6, new Product(6, "tui xach", 2000, "Chanel", "Mua sam"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public Product findById(int id) {
        return productMap.get(id);
    }

    @Override
    public void save(Product product) {
        productMap.put(product.getId(), product);
    }

    @Override
    public void update(int id, Product product) {
        productMap.put(id, product);
    }

    @Override
    public void remove(int id) {
        productMap.remove(id);
    }
}
