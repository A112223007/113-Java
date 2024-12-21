// 顧客類別
import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<MenuItem> order;

    public Customer(String name) {
        this.name = name;
        this.order = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<MenuItem> getOrder() {
        return order;
    }

    public void addToOrder(MenuItem item, int quantity) throws Exception {
        item.addToOrder(quantity);
        order.add(item);
        System.out.println(name + " 點了 " + quantity + " 份 " + item.getName());
    }

    // 查看顧客已點餐點
    public void displayOrder() {
        System.out.println(name + " 的訂單內容：");
        for (MenuItem item : order) {
            System.out.println("- " + item);
        }
    }
}
