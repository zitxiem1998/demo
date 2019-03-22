package service;

import model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {
    private static Map<Integer, Customer> customerMap;

    static {
        customerMap = new HashMap<>();
        customerMap.put(1, new Customer(1, "Truong Tan Hai", "hai@gamil.com", "Quang Nam"));
        customerMap.put(2, new Customer(2, "Truong Tan Hoa", "hoa@gamil.com", "Quang Nam"));
        customerMap.put(3, new Customer(3, "Truong Tan Huy", "huy@gamil.com", "Quang Nam"));
        customerMap.put(4, new Customer(4, "Truong Tan Cu", "cu@gamil.com", "Quang Nam"));
        customerMap.put(5, new Customer(5, "Truong Tan Em", "em@gamil.com", "Quang Nam"));
        customerMap.put(6, new Customer(6, "Truong Tan Nha", "nha@gamil.com", "Quang Nam"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customerMap.values());
    }

    @Override
    public void save(Customer customer) {
        customerMap.put(customer.getId(), customer);
    }

    @Override
    public Customer findById(int id) {
        return customerMap.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customerMap.put(id, customer);
    }

    @Override
    public void remove(int id) {
        customerMap.remove(id);
    }
}
