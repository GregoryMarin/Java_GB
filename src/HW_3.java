import java.util.*;


public class HW_3 {
    public static void main(String[] args) {
        /*
        Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
        Вывести название каждой планеты и количество его повторений в списке.
         */
        System.out.println(Collections.frequency(lst(), "Earth"));
    }

    static List lst(){
        List list = new ArrayList<>();
        list.add("Earth");
        list.add("Jupiter");
        list.add("Mars");
        list.add("Venus");
        list.add("Earth");
        list.add("Earth");
        list.add("Venus");
        list.add("Venus");
        return list;
    }
}
