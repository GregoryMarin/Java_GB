import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class HW_4 {
    public static void main(String[] args) {
        /*
        Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
        Постараться не обращаться к листу по индексам.
         */
        System.out.println(first_task());
    }

    static void first_task(){
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        list = scanner.nextLine();
        ListIterator<String> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()){
            System.out.println(iterator.hasPrevious());
        }
        return list;
    }
}
