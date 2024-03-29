package CW;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class CW_14 {
    public static void main(String[] args) {
        ex2();
    }
    static void ex1(){
        /*
        Принимает от пользователя и запоминает строки.
        Если введено print, выводит строки так, чтобы последняя была первой в списке, а первая - последней.
        Если введено revert, удаляет предыдущую введенную  строку из памяти.
         */
        Scanner sc = new Scanner(System.in);
        boolean work = true;
        LinkedList<String> list = new LinkedList<>();
        while(work){
            System.out.println("Write a command: ");
            String line = sc.nextLine();
            switch (line) {
                case "print":
                    ListIterator<String> iterator = list.listIterator(list.size());
                    while (iterator.hasPrevious()) {
                        System.out.println(iterator.previous());
                    }
                    break;
                case "exit":
                    System.out.println("See you later!");
                    work = false;
                case "revert":
                    list.removeLast();
                default:
                    list.add(line);
            }
        }
    }
    static void ex2(){
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        LinkedList<String> list = new LinkedList<>();
        while (work) {
            System.out.println("Введите команду");
            String line = scanner.nextLine();
            switch (line) {
                case "print":
                    ListIterator<String> iterator = list.listIterator(list.size());
                    while (iterator.hasPrevious()) {
                        System.out.println(iterator.previous());
                    }
                    break;
                case "exit":
                    System.out.println("До новых встреч");
                    work = false;
                    break;
                case "revert":
                    list.removeLast();
                    break;
                default:
                    list.add(line);
            }
        }
    }
}
