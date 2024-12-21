import java.util.Scanner;

public class TaiwanOrder {
    public static void main(String[] args) {
        // 創建測試菜單項目
        MenuItem chicken = new MenuItem("鹽酥雞", 70, 20);
        MenuItem cheese = new MenuItem("起司條", 50, 10);
        MenuItem pig = new MenuItem("豬血糕", 60, 50);
        MenuItem ball = new MenuItem("地瓜球", 40, 50);
        MenuItem dofu = new MenuItem("臭豆腐", 60, 50);
        MenuItem bubbletea = new MenuItem("珍珠奶茶", 60, 20);
        MenuItem oysteromelet = new MenuItem("蚵仔煎", 70, 20);
        MenuItem noddle = new MenuItem("大腸麵線", 60, 20);
        MenuItem tea= new MenuItem("冬瓜茶", 30, 50);
        MenuItem jelly = new MenuItem("仙草凍", 50, 50);

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
                    System.out.println("1. " + chicken);
                    System.out.println("2. " + cheese);
                    System.out.println("3. " + pig);
                    System.out.println("4. " + ball);
                    System.out.println("5. " + dofu);
                    System.out.println("6. " + bubbletea);
                    System.out.println("7. " + oysteromelet);
                    System.out.println("8. " + noddle);
                    System.out.println("9. " + tea);
                    System.out.println("10. " + jelly);
                    System.out.print("請選擇餐點 (1-10): ");

                    String menuChoice = scanner.nextLine();
                    System.out.print("輸入數量: ");
                    int quantity = Integer.parseInt(scanner.nextLine());

                    try {
                        switch (menuChoice) {
                            case "1":
                                order.addItem(chicken, quantity);
                                break;
                            case "2":
                                order.addItem(cheese, quantity);
                                break;
                            case "3":
                                order.addItem(pig, quantity);
                                break;
                            case "4":
                                order.addItem(ball, quantity);
                                break;
                            case "5":
                                order.addItem(dofu, quantity);
                                break;
                            case "6":
                                order.addItem(bubbletea, quantity);
                                break;
                            case "7":
                                order.addItem(oysteromelet, quantity);
                                break;
                            case "8":
                                order.addItem(noddle, quantity);
                                break;
                            case "9":
                                order.addItem(tea, quantity);
                                break;
                            case "10":
                                order.addItem(jelly, quantity);
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
                    if (chicken.getName().equals(removeName)) {
                        toRemove =chicken;
                    } else if (cheese.getName().equals(removeName)) {
                        toRemove = cheese;
                    } else if (pig.getName().equals(removeName)) {
                        toRemove = pig;
                    } else if (ball.getName().equals(removeName)) {
                        toRemove = ball;
                    } else if (dofu.getName().equals(removeName)) {
                        toRemove = dofu;
                    } else if (bubbletea.getName().equals(removeName)) {
                        toRemove = bubbletea;
                    } else if (oysteromelet.getName().equals(removeName)) {
                        toRemove = oysteromelet;
                    } else if (noddle.getName().equals(removeName)) {
                        toRemove = noddle;
                    } else if (tea.getName().equals(removeName)) {
                        toRemove = tea;
                    } else if (jelly.getName().equals(removeName)) {
                        toRemove = jelly;
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
                    if (chicken.getName().equals(searchName) || cheese.getName().equals(searchName) || pig.getName().equals(searchName) || ball.getName().equals(searchName)
                            || dofu.getName().equals(searchName) || bubbletea.getName().equals(searchName) || oysteromelet.getName().equals(searchName)
                            || noddle.getName().equals(searchName) || tea.getName().equals(searchName) || jelly.getName().equals(searchName)) {
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
