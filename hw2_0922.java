import java.util.*;

public class hw2_0922 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        Scanner input = new Scanner(System.in);
        int num;
        map.put(1, "January");
        map.put(2, "Febuary");
        map.put(3, "March");
        map.put(4, "April");
        map.put(5, "May");
        map.put(6, "June");
        map.put(7, "July");
        map.put(8, "August");
        map.put(9, "September");
        map.put(10, "October");
        map.put(11, "November");
        map.put(12, "December");

        do {
            System.out.println("請輸入1~12? ");
            num = input.nextInt();
            if (num < 1 || num > 12) {
                System.out.println("範圍錯誤!");
            }
        } while (num < 1 || num > 12);
        System.out.println("第" + num + "月的英文單字為" + map.get(num));

    }
}