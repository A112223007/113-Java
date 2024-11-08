import com.sun.nio.sctp.AbstractNotificationHandler;

import java.util.ArrayList;

public class SalesPerson {
    private String id;
    private String name;
    private double grossSales;
    private double commissionRate;

    private Order[] orderArray = new Order[3];
    private int orderCount = 0;

    public SalesPerson(String id, String name) {
        this.id = id;
        this.name = name;
        this.commissionRate = 0.01; // 預設獎金比例 0.01
        this.grossSales = 0;
        //預設commissionRate = 0.01
    }

    public SalesPerson(String id, String name, double commissionRate) {
        this.id = id;
        this.name = name;
        this.commissionRate = commissionRate;
        this.grossSales = 0;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate >= 0 && commissionRate <= 1) {
            this.commissionRate = commissionRate;
        } else {
            System.out.println("獎金比例必須在 0 到 1 之間！");
        }
    }

    public void setOrderArray(String itemName, double itemPrice, int amount) {
        if (orderCount == orderArray.length) {
            Order[] newOrderArray = new Order[orderArray.length * 2];
            System.arraycopy(orderArray, 0, newOrderArray, 0, orderArray.length);
            orderArray = newOrderArray;
        }
            orderArray[orderCount] = new Order(itemName, itemPrice, amount);
            orderCount++;

        System.out.println("新增訂單：");
        System.out.println(orderArray[orderCount - 1].toString());
    }

    public double getGrossSales() {
        double totalSales = 0;
        // 計算所有訂單的銷售總額
        for (int i = 0; i < orderCount; i++) {
            totalSales += orderArray[i].totalSale();
        }
        this.grossSales = totalSales;
        return totalSales;
    }


    public String getOrders() {
        StringBuilder ordersDetails = new StringBuilder();
        for (int i = 0; i < orderCount; i++) {
            ordersDetails.append(orderArray[i].toString()).append("\n");
        }
        return ordersDetails.toString();
    }


public double salary() {
    return getGrossSales() * commissionRate;
}

public String toString() {
    return String.format("業務員編號：%s%n業務員姓名：%s%n銷售金額：%.1f%n獎金比例：%.2f%n薪資：%.1f%n",
            this.id, this.name, this.grossSales, this.commissionRate, salary() );
}
}

