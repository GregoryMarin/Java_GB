package Sem6;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        catstask();
    }

    static void catstask(){
        /*
        Придумайте структуру класса Cat. Какие поля и методы будут актуальны для приложения, которое является:
        1) информационной системой ветеринарной клиники
        2) архивом выставки котов
        3) информационной системой Театра кошек Ю.Д.Куклачева
        Можно записать в текстовом виде, не обязательно реализовывать в Java.
        */
        /*
        1. Реализуйте 1 из вариантов класса Cat из предыдущего задания, можно использовать не все придуманные поля и методы.
        Создайте несколько экзэмпляров этого класса, выведите их в консоль.
        2. Добейтесть того, чтобы при выводе в консоль объекта типа Cat, выводилась его кличка, цвет, и возраст
        (или другие параметры на ваше усмотрение).
        */
        /*
        1. Создайте множество, в котором будут храниться экзэмпляры класса Cat - HashSet<Cat>.
        Поместите в него некоторое количество объектов.
        2. Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их в множество.
        Убедитесь, что все они сохранились во множестве.
        3. Создайте метод public boolean equals(Object o)
        Пропишите в нем логику сравнения котов по параметрам, хранимым в полях.
        То есть, метод должен возвращать true, только если значения во всех полях сравниваемых объектов равны.
        4. Выведите снова содержима из пункта 2, убедитесь, что дубликаты удалились.
        */

        Cat cat1 = new Cat("Boris", 10, "Vladimir Sokolov", "Kornishreck");
        Cat cat2 = new Cat("Murzic", 8, "Ivan", "Meynkun");
        Cat cat3 = new Cat("Murzic", 8, "Ivan", "Meynkun");
        Cat cat4 = new Cat("Bigmak", 8, "Petr", "Unknown");
        System.out.println(cat1.getName());

        Set<Cat> cats = new HashSet<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        System.out.println(cats);

        for (Cat cat: cats){
            if(cat.getAge() == 8){
                System.out.println(cat);
            }
        }
        
        
    }

    static void ex0(){
        /*
        1. Создайте HashSet, заполните его следующшими числами: {1, 2, 3, 2, 4, 5, 6, 3} и распечатайте
        2. Создайте LinkedHashSet, заполните его следующшими числами: {1, 2, 3, 2, 4, 5, 6, 3} и распечатайте
        3. Создайте TreeSet, заполните его следующшими числами: {1, 2, 3, 2, 4, 5, 6, 3} и распечатайте
         */
        Integer[] arr = new Integer[]{3, 1, 2, 2, 6, 4, 5, 3};
        Set<Integer> set1 = new HashSet<>(Arrays.asList(arr));
        Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(arr));
        Set<Integer> set3 = new TreeSet<>(Arrays.asList(arr));
        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);
    }

    static void ex1(){
        /*
        Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
        Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент
        уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.
        Для вычисления процента используйте формулу:
        процент уникальных чисел = кол-во уник чисел * 100 / общее кол-во чисел в массиве
         */

        Integer[] arr = Methods.createSet(0, 24, 1000);
        System.out.println(Arrays.toString(arr));
        double percent = Methods.unic(arr);
        System.out.println("Unic percent: " + percent);
    }


}

