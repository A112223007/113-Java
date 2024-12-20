import java.util.ArrayList;

public class ArrayListDemo {
    public static void  main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("ArrayList內容: " + list);

        String fruit = list.get(1);
        System.out.println("第二個元素是: " + fruit);

        list.set(1, "BlueBerry");
        System.out.println("更新後的ArrayList: " + list);

        list.remove(0);
        System.out.println("刪除後的ArrayList: " + list);

        int size = list.size();
        System.out.println("ArrayList大小: " + size);

        boolean containsCherry = list.contains("Cherry");
        System.out.println("ArrayList是否包含'Cherry'?" + containsCherry);

        if (!list.isEmpty()) {
            System.out.println("使用迴圈訪問元素: ");
            for (String item : list) {
                System.out.println(item);
            }
        }
        else {
            System.out.println("ArrayList是空的");
        }
    }
}
