import java.util.*;
public class HW_2_0 {
    public static void main(String[] args) {
        /*
        Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
        Постараться не обращаться к листу по индексам.
         */
        first_task();
    }

    static void first_task(){
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i < 1; i++) {
            list.add(scanner.nextLine());
        }
        ListIterator<String> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()){
            System.out.println(iterator.hasPrevious());
        }
    }
}
