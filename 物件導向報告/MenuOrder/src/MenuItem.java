// 定義菜單項目
import java.util.Objects;

public class MenuItem implements Searchable, Orderable {
    private String name;
    private double price;
    private int stock;

    public MenuItem(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public boolean search(String keyword) {
        return name.contains(keyword);
    }

    @Override
    public void addToOrder(int quantity) throws Exception {
        if (quantity > stock) {
            throw new OutOfStockException("餐點 [" + name + "] 已售罄或庫存不足！");
        }
        stock -= quantity;
    }

    public void updateStock(int newStock) {
        if (newStock < 0) {
            throw new IllegalArgumentException("庫存不能為負數！");
        }
        this.stock = newStock;
    }

    @Override
    public String toString() {
        return name + " - $" + price + " (" + stock + " in stock)";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Objects.equals(name, menuItem.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
