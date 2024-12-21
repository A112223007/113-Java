// 員工類別
public class Staff {
    private String name;
    private String role;

    public Staff(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public void processOrder(Customer customer) {
        System.out.println("員工 " + name + " 處理了 " + customer.getName() + " 的訂單。");
    }
}
