import java.util.ArrayList;
import java.util.List;

public class CW_11 {
    public static void main(String[] args) {
        /*
        Создать список типа ArrayList
Поместить в него как строки, так и целые числа.
Пройти по списку, найти и удалить целые числа.
         */
        List list = new ArrayList<>();
        list.add(5);
        list.add("4");
        list.add(null);
        list.add(7.9);
        list.add(-89);
        System.out.println(list);
        remove_integer(list);
        System.out.println(list);
    }

    static void remove_integer(List list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Integer) {
                list.remove(i);
                i--;
            }
        }
    }
}
