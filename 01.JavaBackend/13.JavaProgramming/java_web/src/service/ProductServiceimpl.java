package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceimpl implements ProductService {
    private static Map<Integer, Product> productMap;

    static {
        productMap = new HashMap<>();
        productMap.put(1, new Product(1, "book", 20000, "sach ", "Kim Dong"));
        productMap.put(2, new Product(2, "table", 100000, "ban hoc", "Tan Tien"));
        productMap.put(3, new Product(3, "pencil", 3000, "but chi", "Toan Nang"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public void save(Product product) {
        productMap.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return productMap.get(id);
    }

    @Override
    public void update(int id, Product product) {
        productMap.put(id, product);
    }

    @Override
    public void remove(int id) {
        productMap.remove(id);
    }

    @Override
    public Product findByName(String name) {
       for(Map.Entry me:productMap.entrySet()) {
           if(((Product)me.getValue()).getName().equals(name)) {
               return (Product) me.getValue();
           }
       }
       return null;
    }
}
