public class SalesPerson {
    private String id;
    private String name;
    private double grossSales;
    private double commissionRate;

    public SalesPerson(String id, String name) {
        this.id = id;
        this.name = name;
        this.grossSales = 0.0;
        this.commissionRate = 0.01;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales >= 0) {
            this.grossSales = grossSales;
        } else {
            System.out.println("銷售金額必須為正數！");
        }
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate >= 0 && commissionRate <= 1) {
            this.commissionRate = commissionRate;
        } else {
            System.out.println("獎金比例必須介於 0 和 1 之間！");
        }
    }

    public double salary() {
        return this.grossSales * this.commissionRate;
    }

    public String toString() {
        return String.format("業務員編號：%s%n業務員姓名：%s%n銷售金額：%.1f%n獎金比例：%.1f%n薪資：%.1f%n",
                this.id, this.name, this.grossSales, this.commissionRate, salary() );
    }
}

