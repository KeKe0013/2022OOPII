import java.util.*;

public class hw1_0922 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<Integer>();
        Random random = new Random();
        System.out.println("從1~100的整數中,亂數取出10個不重複的號碼");

        while (set.size() < 10) {
            int num = random.nextInt(101);
            if (num == 0 || set.contains(num)) {
                continue;
            } else {
                set.add(num);
                System.out.println("第" + set.size() + "個號碼：" + num);
            }

        }
        System.out.println("物件內元素個素為：" + set.size());
        System.out.println("物件內元素內容：" + set);
        System.out.println("第一個元素內容為：" + set.first());
        System.out.println("最後一個元素內容：" + set.last());
        System.out.println("內容介於30~70者:" + set.subSet(30, 70));

    }

}