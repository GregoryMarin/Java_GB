import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CW_15 {
    public static void main(String[] args) {
        /*
        Замерьте время, с которым в ArrayList добавится 10000 элементов
        Замерьте время, с которым в LinkedList добавится 10000 элементов. Сравните с предыдущим.
         */
        List<Integer> arrList = new ArrayList<>();
        List <Integer> linkedList = new LinkedList<>();

        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            linkedList.add(0, i);
        }
        long timeFinish = System.currentTimeMillis();
        System.out.println(timeFinish - timeStart);
    }
}
