import java.util.ArrayList;
import java.util.List;

public class ListCustomer {
    private static final List<Customer> listCustomer = new ArrayList<>();
    static {
        initArray();
    }

    private static void initArray() {
        Customer customers0 = new Customer();
        Customer customers1 = new Customer("Truong Tan Hai", "28101998", "Dien Ngoc");
        Customer customers2 = new Customer("Truong Tan Hoa", "28101998", "Dien Ngoc");
        Customer customers3 = new Customer("Truong Tan Huy", "28101998", "Dien Ngoc");

        listCustomer.add(customers0);
        listCustomer.add(customers1);
        listCustomer.add(customers2);
        listCustomer.add(customers3);
    }

    public static List<Customer> queryDepartments() {
        return listCustomer;
    }
}
