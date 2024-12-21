// 訂單管理類別
import java.util.HashSet;

public class OrderManager {
    private HashSet<Customer> customers;

    public OrderManager() {
        this.customers = new HashSet<>();
    }

    // 新增顧客
    public void addCustomer(Customer customer) {
        if (customers.add(customer)) {
            System.out.println("新增顧客：" + customer.getName());
        } else {
            System.out.println("顧客已存在：" + customer.getName());
        }
    }

    // 查看所有顧客
    public void displayCustomers() {
        System.out.println("目前顧客名單：");
        for (Customer customer : customers) {
            System.out.println("- " + customer.getName());
        }
    }
}
