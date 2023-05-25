import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class class_work_my_version {
    public static void main(String[] args) {

        addAndDeleteElement();
    }
    static void addAndDeleteElement(){
         /*
        Принимает и запоминает строки.
        Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
        Если введено revert, удаляет посьеднюю введенную строку из памяти.
         */
        Scanner sc = new Scanner(System.in);
        boolean word = true;
        LinkedList<String> list = new LinkedList<>();
        while(word){
            System.out.println("Write a command: ");
            String line = sc.nextLine();
            switch (line){
                case "print":
                    ListIterator<String> iterator = list.listIterator(list.size());
                    while(iterator.hasPrevious()){
                        System.out.println(iterator.previous());
                    }
                    break;
                case "exit":
                    System.out.println("See you next time!");
                    word = false;
                    break;
                case "revert":
                    list.removeLast();
                default:
                    list.add(line);
            }
        }
    }
    static void exampleWithStack(){
        /*
        1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
        2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.
         */
    }
}
