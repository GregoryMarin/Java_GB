package HW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HW_3sem_Alltask {
    /*
    Пусть дан произвольный список целых чисел, удалить из него четные числа
     */
    public static void main(String[] args) {
        task3();
    }


    static void task1(){
        List<Integer> list = HW_Methods.crRndArrListInt(15, 1, 50);
        System.out.println(list);
        HW_Methods.removeEvenNum(list);
        System.out.println(list);
    }

    static void task2(){
        /*
        Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
        Collections.max()
         */
        List<Integer> list = HW_Methods.crRndArrListInt(20, 1, 1000);
        System.out.println(list);
        int max = Collections.max(list);
        int min = Collections.min(list);
        double average = HW_Methods.findAverage(list);
        System.out.println("Max number is: " + max + "\n" + "Min number is: " + min + "\n" + "Average number is: " + average);

    }

    static void task3(){
        /*
        Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
        Вывести название каждой планеты и количество его повторений в списке.
         */
        List<String> planets = new ArrayList<>();
        planets.add("Earth");
        planets.add("Saturn");
        planets.add("Mars");
        planets.add("Earth");
        planets.add("Saturn");
        planets.add("Earth");
        planets.add("Neptun");
        planets.add("Mars");
        System.out.println(planets);
        System.out.println(HW_Methods.planetFinder(planets));
    }

}