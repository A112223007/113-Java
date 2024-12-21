// 訂單類別
import java.util.HashSet;

public class Order {
    private HashSet<MenuItem> items;

    public Order() {
        this.items = new HashSet<>();
    }

    // 添加餐點
    public void addItem(MenuItem item, int quantity) throws Exception {
        if (!items.contains(item)) {
            items.add(item);
        }
        item.addToOrder(quantity);
        System.out.println("已添加 " + quantity + " 份 " + item.getName() + " 到訂單。");
    }

    // 移除餐點
    public void removeItem(MenuItem item) {
        if (items.remove(item)) {
            System.out.println("已移除餐點：" + item.getName());
        } else {
            System.out.println("餐點不在訂單中。");
        }
    }

    // 更新餐點數量
    public void updateItem(MenuItem item, int newQuantity) throws Exception {
        if (!items.contains(item)) {
            System.out.println("餐點不在訂單中。");
            return;
        }

        int currentStock = item.getStock();
        int currentOrderQuantity = currentStock + (items.stream()
                .filter(i -> i.equals(item)).mapToInt(MenuItem::getStock).sum());

        if (newQuantity > currentOrderQuantity) {
            // 添加更多
            item.addToOrder(newQuantity - currentOrderQuantity);
        } else if (newQuantity < currentOrderQuantity) {
            // 退回多餘的數量
            item.updateStock(currentStock + (currentOrderQuantity - newQuantity));
        }
        System.out.println("已更新 " + item.getName() + " 的數量為 " + newQuantity + "。");
    }

    // 查看訂單
    public void displayOrder() {
        System.out.println("當前訂單內容：");
        for (MenuItem item : items) {
            System.out.println("- " + item);
        }
    }
}
