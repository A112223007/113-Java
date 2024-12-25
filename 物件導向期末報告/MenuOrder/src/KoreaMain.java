public class KoreaMain {
    public static void main(String[] args) {
        try {
            // 創建菜單項目
            MenuItem seafoodcookie = new MenuItem("海鮮煎餅", 100, 50);
            MenuItem pot = new MenuItem("部隊鍋", 200, 15);
            MenuItem friednoodle = new MenuItem("炸醬麵",60, 50);
            MenuItem pigrice = new MenuItem("豬肉拌飯", 100, 50);
            MenuItem bananamilk = new MenuItem("香蕉牛奶", 40, 50);
            MenuItem seaweedrice = new MenuItem("海苔飯捲", 80, 60);
            MenuItem koreabeef = new MenuItem("韓牛", 700, 20);
            MenuItem lotus = new MenuItem("甜筒冰淇淋", 70, 20);
            MenuItem Kimchi = new MenuItem("泡菜", 40, 50);
            MenuItem muffins = new MenuItem("紅豆鬆餅", 100, 50);

            // 創建顧客和員工
            Customer customer1 = new Customer("Alice");
            VIPCustomer vipCustomer = new VIPCustomer("Bob", 0.1);

            // 創建訂單
            Order order = new Order();
            order.addItem(friednoodle, 2);
            order.addItem(seaweedrice, 3);

            // 查看訂單
            System.out.println("\n=== 初始訂單 ===");
            order.displayOrder();

            // 修改訂單內容
            System.out.println("\n=== 修改訂單 ===");
            order.addItem(bananamilk, 1); // 添加餐點
            order.updateItem(pot, 3); // 更新數量
            order.removeItem(seaweedrice); // 移除餐點

            // 查看修改後的訂單
            System.out.println("\n=== 修改後訂單 ===");
            order.displayOrder();

            // 顧客點餐並查看訂單
            System.out.println("\n=== 顧客點餐 ===");
            customer1.addToOrder(bananamilk, 2);
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
