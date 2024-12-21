import java.util.Scanner;

public class TaiwanMain {
    public static void main(String[] args) {
        try {
            // 創建菜單項目
            MenuItem chicken = new MenuItem("鹽酥雞", 70, 20);
            MenuItem cheese = new MenuItem("炸起司條", 50, 10);
            MenuItem pig = new MenuItem("豬血糕", 60, 50);
            MenuItem ball = new MenuItem("地瓜球", 40, 50);
            MenuItem tofu = new MenuItem("臭豆腐", 60, 50);
            MenuItem bubbletea = new MenuItem("珍珠奶茶", 60, 20);
            MenuItem oysteromelet = new MenuItem("蚵仔煎", 70, 20);
            MenuItem noodle = new MenuItem("大腸麵線", 60, 20);
            MenuItem tea = new MenuItem("冬瓜茶", 30, 50);
            MenuItem jelly = new MenuItem("仙草凍", 50, 50);

            // 創建顧客和員工
            Customer customer1 = new Customer("Alice");
            VIPCustomer vipCustomer = new VIPCustomer("Bob", 0.1);

            // 創建訂單
            Order order = new Order();
            order.addItem(chicken, 2);
            order.addItem(bubbletea, 1);

            // 查看訂單
            order.displayOrder();

            // 修改訂單內容
            order.addItem(tofu, 3); // 添加餐點
            order.updateItem(bubbletea, 2); // 更新數量
            order.removeItem(chicken); // 移除餐點

            // 查看修改後的訂單
            order.displayOrder();

            // 顧客點餐並查看訂單
            customer1.addToOrder(cheese, 2);
            customer1.displayOrder();

            // 新增顧客
            OrderManager manager = new OrderManager();
            manager.addCustomer(customer1);
            manager.addCustomer(vipCustomer);
            manager.displayCustomers();
        } catch (Exception e) {
            System.out.println("錯誤：" + e.getMessage());
        }
    }
}
