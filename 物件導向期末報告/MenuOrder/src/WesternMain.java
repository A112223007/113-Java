public class WesternMain {
    public static void main(String[] args) {
        try {
            // 創建菜單項目
            MenuItem burger = new MenuItem("漢堡", 50, 10);
            MenuItem pizza = new MenuItem("披薩", 100, 5);
            MenuItem cola = new MenuItem("可樂", 30, 20);
            MenuItem fries = new MenuItem("薯條", 50, 50);
            MenuItem donuts = new MenuItem("甜甜圈", 45, 50);
            MenuItem spaghetti = new MenuItem("義大利麵", 130, 20);
            MenuItem sundae = new MenuItem("聖代", 80, 20);
            MenuItem grilled = new MenuItem("焗烤", 150, 20);
            MenuItem chickennuggets = new MenuItem("雞塊", 40, 50);
            MenuItem lemontea = new MenuItem("檸檬紅茶", 30, 50);

            // 創建顧客和員工
            Customer customer1 = new Customer("Alice");
            VIPCustomer vipCustomer = new VIPCustomer("Bob", 0.1);

            // 創建訂單
            Order order = new Order();
            order.addItem(burger, 2);
            order.addItem(cola, 3);

            // 查看訂單
            System.out.println("\n=== 初始訂單 ===");
            order.displayOrder();

            // 修改訂單內容
            System.out.println("\n=== 修改訂單 ===");
            order.addItem(pizza, 1); // 添加餐點
            order.updateItem(burger, 3); // 更新數量
            order.removeItem(cola); // 移除餐點

            // 查看修改後的訂單
            System.out.println("\n=== 修改後訂單 ===");
            order.displayOrder();

            // 顧客點餐並查看訂單
            System.out.println("\n=== 顧客點餐 ===");
            customer1.addToOrder(burger, 2);
            customer1.displayOrder();

            // 新增顧客
            System.out.println("\n=== 顧客清單 ===");
            OrderManager manager = new OrderManager();
            manager.addCustomer(customer1);
            manager.addCustomer(vipCustomer);
            manager.displayCustomers();
        } catch (Exception e) {
            System.out.println("錯誤：" + e.getMessage());
        }
    }
}
