package Sem5;

import java.awt.*;
import java.awt.List;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        contacts();
    }

    static void contacts(){
        /*
        Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
        Нужны методы добавления новой записи в книгу и метод поиска записей в телефонной книге
        */
        MethodsHW contacts = new MethodsHW();
        contacts.addContact("Gregory", "123");
        contacts.addContact("Jordan", "132");
        contacts.addContact("Freak", "133");
        contacts.addContact("freak", "223");
        contacts.addContact("freak", "323");
        contacts.findByName("Gregory");
    }

//    static void task2(){
//        /*Пусть дан список сотрудников:
//        Иван Иванов,
//        Светлана Петрова,
//        Кристина Белова,
//        Анна Мусина,
//        Анна Крутова,
//        Иван Юрин,
//        Петр Лыков,
//        Павел Чернов,
//        Петр Чернышов,
//        Мария Федорова,
//        Марина Светлова,
//        Мария Савина,
//        Мария Рыкова,
//        Марина Лугова,
//        Анна Владимирова,
//        Иван Мечников,
//        Петр Петин,
//        Иван Ежов.
//        Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
//        Отсортировать по убыванию популярности. Для сортировки использовать TreeMap.*/
//
//        TreeMap<Integer, List<String>> treeMap = new TreeMap(Comparator.reverseOrder());
//        String[] list = {"Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина",
//                "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова",
//                "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников",
//                "Петр Петин", "Иван Ежов"};
//        ArrayList<String> lst = new ArrayList<>(Arrays.asList(list));
//        while (!lst.isEmpty()) {
//            int count = 0;
//            String name = lst.get(0).substring(0, lst.get(0).indexOf(' '));
//            Iterator<String> strIter = lst.iterator();
//            while (strIter.hasNext()) {
//                String str = strIter.next();
//                if (name.equalsIgnoreCase(str.substring(0, str.indexOf(' ')))) {
//                    count++;
//                    strIter.remove();
//                }
//            }
//            if (treeMap.containsKey(count)) {
//                java.util.List<String> temp = (java.util.List<String>) treeMap.get(count);
//                temp.add(name);
//            } else {
//                java.util.List<String> temp = new ArrayList<>();
//                temp.add(name);
//                treeMap.put(count, temp);
//            }
//        }
//        System.out.println(treeMap);
//    }
}
