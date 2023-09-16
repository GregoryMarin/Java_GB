package Notebook;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        noteBook();
    }

    static void noteBook(){
        /*
        Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в Java
        Создать множество ноутбуков.
        Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет
        ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
        "Введите цифру соответствующую необходиимому критерию:
        1 - ОЗУ
        2 - обьем ЖД
        3 - операционная система
        4 - цвет..."
        Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации
        можно так же в Map. Отфильтровать ноутбуки из первоночального списка множества и вывести прозодящие
        по условиям
         */
        Scanner sc = new Scanner(System.in);

        Notebook nb1 = new Notebook("Samsung", 6, 120, "Linux", "silver");
        Notebook nb2 = new Notebook("Lenovo", 4, 100, "Microsoft", "white");
        Notebook nb3 = new Notebook("NotePad",8, 240, "Microsoft", "brown");
        Notebook nb4 = new Notebook("MacBookPro1",16, 500, "IOS", "grey");
        Notebook nb5 = new Notebook("MacBookPro2",8, 500, "IOS", "grey");
        Notebook nb6 = new Notebook("Sony",4, 120, "Linux", "white");

        Set<Notebook> nb = new HashSet<>();
        nb.add(nb1);
        nb.add(nb2);
        nb.add(nb3);
        nb.add(nb4);
        nb.add(nb5);
        nb.add(nb6);

        System.out.println("Write parameters of notebook you need: \n 1) OZU \n 2) hd_capacity \n");
        int ozu = sc.nextInt();
        int capacity = sc.nextInt();
        System.out.println(Notebook.getByOZU_capacity(ozu, capacity));
    }
}
