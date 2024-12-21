public class VIPCustomer extends Customer {
    private double discountRate;

    public VIPCustomer(String name, double discountRate) {
        super(name);
        this.discountRate = discountRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    // 計算訂單總額（含折扣）
    public double calculateTotal() {
        double total = 0;
        for (MenuItem item : getOrder()) {
            total += item.getPrice();
        }
        return total * (1 - discountRate);
    }
}
