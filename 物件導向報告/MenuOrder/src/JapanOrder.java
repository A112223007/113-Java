import java.util.Scanner;

public class JapanOrder {
    public static void main(String[] args) {
        // 創建測試菜單項目
        MenuItem ramen = new MenuItem("拉麵", 150, 20);
        MenuItem sushi = new MenuItem("壽司", 30, 10);
        MenuItem misosoup = new MenuItem("味噌湯", 40, 50);
        MenuItem katsudon = new MenuItem("豬排丼", 130, 50);
        MenuItem teabowl = new MenuItem("茶碗蒸", 30, 50);
        MenuItem soba = new MenuItem("蕎麥麵", 100, 20);
        MenuItem calpis = new MenuItem("可爾必思", 30, 20);
        MenuItem applejuice = new MenuItem("蘋果汁", 30, 20);
        MenuItem pudding= new MenuItem("焦糖布丁", 40, 50);
        MenuItem daifuku = new MenuItem("大福", 40, 50);

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
                    System.out.println("1. " + ramen);
                    System.out.println("2. " + sushi);
                    System.out.println("3. " + misosoup);
                    System.out.println("4. " + katsudon);
                    System.out.println("5. " + teabowl);
                    System.out.println("6. " + soba);
                    System.out.println("7. " + calpis);
                    System.out.println("8. " + applejuice);
                    System.out.println("9. " + pudding);
                    System.out.println("10. " + daifuku);
                    System.out.print("請選擇餐點 (1-10): ");

                    String menuChoice = scanner.nextLine();
                    System.out.print("輸入數量: ");
                    int quantity = Integer.parseInt(scanner.nextLine());

                    try {
                        switch (menuChoice) {
                            case "1":
                                order.addItem(ramen, quantity);
                                break;
                            case "2":
                                order.addItem(sushi, quantity);
                                break;
                            case "3":
                                order.addItem(misosoup, quantity);
                                break;
                            case "4":
                                order.addItem(katsudon, quantity);
                                break;
                            case "5":
                                order.addItem(teabowl, quantity);
                                break;
                            case "6":
                                order.addItem(soba, quantity);
                                break;
                            case "7":
                                order.addItem(calpis, quantity);
                                break;
                            case "8":
                                order.addItem(applejuice, quantity);
                                break;
                            case "9":
                                order.addItem(pudding, quantity);
                                break;
                            case "10":
                                order.addItem(daifuku, quantity);
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
                    if (ramen.getName().equals(removeName)) {
                        toRemove = ramen;
                    } else if (sushi.getName().equals(removeName)) {
                        toRemove = sushi;
                    } else if (misosoup.getName().equals(removeName)) {
                        toRemove = misosoup;
                    } else if (katsudon.getName().equals(removeName)) {
                        toRemove = katsudon;
                    } else if (teabowl.getName().equals(removeName)) {
                        toRemove = teabowl;
                    } else if (soba.getName().equals(removeName)) {
                        toRemove = soba;
                    } else if (calpis.getName().equals(removeName)) {
                        toRemove = calpis;
                    } else if (applejuice.getName().equals(removeName)) {
                        toRemove = applejuice;
                    } else if (pudding.getName().equals(removeName)) {
                        toRemove = pudding;
                    } else if (daifuku.getName().equals(removeName)) {
                        toRemove = daifuku;
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
                    if (ramen.getName().equals(searchName) || sushi.getName().equals(searchName) || misosoup.getName().equals(searchName) || katsudon.getName().equals(searchName)
                            || teabowl.getName().equals(searchName) || soba.getName().equals(searchName) || calpis.getName().equals(searchName)
                            || applejuice.getName().equals(searchName) || pudding.getName().equals(searchName) || daifuku.getName().equals(searchName)) {
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
