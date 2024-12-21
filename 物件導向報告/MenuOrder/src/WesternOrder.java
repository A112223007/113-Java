import java.util.Scanner;

public class WesternOrder {
    public static void main(String[] args) {
        // 創建測試菜單項目
        MenuItem burger = new MenuItem("漢堡", 50, 20);
        MenuItem pizza = new MenuItem("披薩", 100, 10);
        MenuItem cola = new MenuItem("可樂", 30, 50);
        MenuItem fries = new MenuItem("薯條", 50, 50);
        MenuItem donuts = new MenuItem("甜甜圈", 45, 50);
        MenuItem spaghetti = new MenuItem("義大利麵", 130, 20);
        MenuItem sundae = new MenuItem("聖代", 80, 20);
        MenuItem grilled = new MenuItem("焗烤", 150, 20);
        MenuItem chickennuggets= new MenuItem("雞塊", 40, 50);
        MenuItem lemontea = new MenuItem("檸檬紅茶", 30, 50);

        // 創建訂單
        Order order = new Order();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== 點餐系統 ===");
            System.out.println("1. 從訂單添加餐點");
            System.out.println("2. 從訂單刪除餐點");
            System.out.println("3. 列出所有訂單餐點");
            System.out.println("4. 查詢餐點是否存在於訂單");
            System.out.println("5. 退出");
            System.out.print("請選擇操作: ");

            String input = scanner.nextLine();

            switch (input) {
                case "1": // 添加餐點
                    System.out.println("\n=== 可供選擇的菜單項目 ===");
                    System.out.println("1. " + burger);
                    System.out.println("2. " + pizza);
                    System.out.println("3. " + cola);
                    System.out.println("4. " + fries);
                    System.out.println("5. " + donuts);
                    System.out.println("6. " + spaghetti);
                    System.out.println("7. " + sundae);
                    System.out.println("8. " + grilled);
                    System.out.println("9. " + chickennuggets);
                    System.out.println("10. " + lemontea);
                    System.out.print("請選擇餐點 (1-10): ");

                    String menuChoice = scanner.nextLine();
                    System.out.print("輸入數量: ");
                    int quantity = Integer.parseInt(scanner.nextLine());

                    try {
                        switch (menuChoice) {
                            case "1":
                                order.addItem(burger, quantity);
                                break;
                            case "2":
                                order.addItem(pizza, quantity);
                                break;
                            case "3":
                                order.addItem(cola, quantity);
                                break;
                            case "4":
                                order.addItem(fries, quantity);
                                break;
                            case "5":
                                order.addItem(donuts, quantity);
                                break;
                            case "6":
                                order.addItem(spaghetti, quantity);
                                break;
                            case "7":
                                order.addItem(sundae, quantity);
                                break;
                            case "8":
                                order.addItem(grilled, quantity);
                                break;
                            case "9":
                                order.addItem(chickennuggets, quantity);
                                break;
                            case "10":
                                order.addItem(lemontea, quantity);
                                break;
                            default:
                                System.out.println("無效選項！");
                        }
                    } catch (Exception e) {
                        System.out.println("錯誤：" + e.getMessage());
                    }
                    break;

                case "2": // 刪除餐點
                    System.out.println("\n=== 當前訂單餐點 ===");
                    order.displayOrder();
                    System.out.print("輸入要刪除的餐點名稱: ");
                    String removeName = scanner.nextLine();

                    MenuItem toRemove = null;
                    if (burger.getName().equals(removeName)) {
                        toRemove = burger;
                    } else if (pizza.getName().equals(removeName)) {
                        toRemove = pizza;
                    } else if (cola.getName().equals(removeName)) {
                        toRemove = cola;
                    } else if (fries.getName().equals(removeName)) {
                        toRemove = fries;
                    } else if (donuts.getName().equals(removeName)) {
                        toRemove = donuts;
                    } else if (spaghetti.getName().equals(removeName)) {
                        toRemove = spaghetti;
                    } else if (sundae.getName().equals(removeName)) {
                        toRemove = sundae;
                    } else if (grilled.getName().equals(removeName)) {
                        toRemove = grilled;
                    } else if (chickennuggets.getName().equals(removeName)) {
                        toRemove = chickennuggets;
                    } else if (lemontea.getName().equals(removeName)) {
                        toRemove = lemontea;
                    }

                    if (toRemove != null) {
                        order.removeItem(toRemove);
                    } else {
                        System.out.println("餐點不在訂單中！");
                    }
                    break;

                case "3": // 列出所有訂單餐點
                    order.displayOrder();
                    break;

                case "4": // 查詢餐點
                    System.out.print("輸入要查詢的餐點名稱: ");
                    String searchName = scanner.nextLine();

                    boolean exists = false;
                    if (burger.getName().equals(searchName) || pizza.getName().equals(searchName) || cola.getName().equals(searchName) || fries.getName().equals(searchName)
                            || donuts.getName().equals(searchName) || spaghetti.getName().equals(searchName) || sundae.getName().equals(searchName)
                            || grilled.getName().equals(searchName) || chickennuggets.getName().equals(searchName) || lemontea.getName().equals(searchName)) {
                        exists = true;
                    }

                    if (exists) {
                        System.out.println("餐點 " + searchName + " 存在於訂單中！");
                    } else {
                        System.out.println("餐點 " + searchName + " 不存在！");
                    }
                    break;

                case "5": // 退出
                    System.out.println("退出系統，感謝使用！");
                    scanner.close();
                    return;

                default:
                    System.out.println("無效選項，請重新輸入！");
            }
        }
    }
}
