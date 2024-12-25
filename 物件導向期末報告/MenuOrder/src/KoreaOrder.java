import java.util.Scanner;

public class KoreaOrder {
    public static void main(String[] args) {
        // 創建測試菜單項目
        MenuItem seafoodcookie = new MenuItem("海鮮煎餅", 100, 50);
        MenuItem pot = new MenuItem("部隊鍋", 200, 15);
        MenuItem friednoodle = new MenuItem("炸醬麵",60, 50);
        MenuItem pigrice = new MenuItem("豬肉拌飯", 100, 50);
        MenuItem bananamilk = new MenuItem("香蕉牛奶", 40, 50);
        MenuItem seaweedrice = new MenuItem("海苔飯捲", 80, 60);
        MenuItem koreabeef = new MenuItem("韓牛", 700, 20);
        MenuItem lotus = new MenuItem("甜筒冰淇淋", 70, 20);
        MenuItem kimchi = new MenuItem("泡菜", 40, 50);
        MenuItem muffins = new MenuItem("紅豆鬆餅", 100, 50);

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
                    System.out.println("1. " + seafoodcookie);
                    System.out.println("2. " + pot);
                    System.out.println("3. " + friednoodle);
                    System.out.println("4. " + pigrice);
                    System.out.println("5. " + bananamilk);
                    System.out.println("6. " + seaweedrice);
                    System.out.println("7. " + koreabeef);
                    System.out.println("8. " + lotus);
                    System.out.println("9. " + kimchi);
                    System.out.println("10. " + muffins);
                    System.out.print("請選擇餐點 (1-10): ");

                    String menuChoice = scanner.nextLine();
                    System.out.print("輸入數量: ");
                    int quantity = Integer.parseInt(scanner.nextLine());

                    try {
                        switch (menuChoice) {
                            case "1":
                                order.addItem(seafoodcookie, quantity);
                                break;
                            case "2":
                                order.addItem(pot, quantity);
                                break;
                            case "3":
                                order.addItem(friednoodle, quantity);
                                break;
                            case "4":
                                order.addItem(pigrice, quantity);
                                break;
                            case "5":
                                order.addItem(bananamilk, quantity);
                                break;
                            case "6":
                                order.addItem(seaweedrice, quantity);
                                break;
                            case "7":
                                order.addItem(koreabeef, quantity);
                                break;
                            case "8":
                                order.addItem(lotus, quantity);
                                break;
                            case "9":
                                order.addItem(kimchi, quantity);
                                break;
                            case "10":
                                order.addItem(muffins, quantity);
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
                    if (seafoodcookie.getName().equals(removeName)) {
                        toRemove = seafoodcookie;
                    } else if (pot.getName().equals(removeName)) {
                        toRemove = pot;
                    } else if (friednoodle.getName().equals(removeName)) {
                        toRemove = friednoodle;
                    } else if (pigrice.getName().equals(removeName)) {
                        toRemove = pigrice;
                    } else if (bananamilk.getName().equals(removeName)) {
                        toRemove = bananamilk;
                    } else if (seaweedrice.getName().equals(removeName)) {
                        toRemove = seaweedrice;
                    } else if (koreabeef.getName().equals(removeName)) {
                        toRemove = koreabeef;
                    } else if (lotus.getName().equals(removeName)) {
                        toRemove = lotus;
                    } else if (kimchi.getName().equals(removeName)) {
                        toRemove = kimchi;
                    } else if (muffins.getName().equals(removeName)) {
                        toRemove = muffins;
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
                    if (seafoodcookie.getName().equals(searchName) || pot.getName().equals(searchName) || friednoodle.getName().equals(searchName) || pigrice.getName().equals(searchName)
                            || bananamilk.getName().equals(searchName) || seaweedrice.getName().equals(searchName) || koreabeef.getName().equals(searchName)
                            || lotus.getName().equals(searchName) || kimchi.getName().equals(searchName) || muffins.getName().equals(searchName)) {
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