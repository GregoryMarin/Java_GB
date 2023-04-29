import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CW_12 {
    public static void main(String[] args) {
        /*
        1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
        2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.
         */
        exemple();
    }

    static void exemple(){
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list1.add(i);
        }
        long timeFinish = System.currentTimeMillis();
    }
}
