import java.util.Scanner;

public class JapanMain {
    public static void main(String[] args) {
        try {
            // 創建菜單項目
            MenuItem ramen = new MenuItem("拉麵", 150, 20);
            MenuItem sushi = new MenuItem("壽司", 30, 10);
            MenuItem misosoup = new MenuItem("味噌湯", 40, 50);
            MenuItem katsudon = new MenuItem("豬排丼", 130, 50);
            MenuItem teabowl = new MenuItem("茶碗蒸", 30, 50);
            MenuItem soba = new MenuItem("蕎麥麵", 100, 20);
            MenuItem calpis = new MenuItem("可爾必思", 30, 20);
            MenuItem applejuice = new MenuItem("蘋果汁", 30, 20);
            MenuItem pudding = new MenuItem("焦糖布丁", 40, 50);
            MenuItem daifuku = new MenuItem("大福", 40, 50);

            // 創建顧客和員工
            Customer customer1 = new Customer("Taro");
            VIPCustomer vipCustomer = new VIPCustomer("Hanako", 0.15);

            // 創建訂單
            Order order = new Order();
            order.addItem(ramen, 2);
            order.addItem(sushi, 3);

            // 查看訂單
            order.displayOrder();

            // 修改訂單內容
            order.addItem(katsudon, 1); // 添加餐點
            order.updateItem(sushi, 5); // 更新數量
            order.removeItem(ramen); // 移除餐點

            // 查看修改後的訂單
            order.displayOrder();

            // 顧客點餐並查看訂單
            customer1.addToOrder(misosoup, 2);
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
