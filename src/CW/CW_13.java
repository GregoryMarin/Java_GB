//import java.util.LinkedList;
//import java.util.Scanner;
//
//public class CW_13 {
//    public static void main(String[] args) {
//        /*
//        Реализовать консольное приложение, которое:
//        Принимает от пользователя строку вида text~num
//        Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
//        Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
//         */
//        example1();
//    }
//
//    static void example1(){
//        Scanner scanner = new Scanner(System.in);
//        boolean work = true;
//        LinkedList<String> list = new LinkedList<>();
//        while (work){
//            System.out.println("Write a command: ");
//            String command = scanner.nextLine();
//            String[] st = command.split("~");
//            switch (st[0]){
//                case "print":
//                    System.out.println(list.remove(Integer.parseInt(st[1])));
//                    break;
//                case "exit":
//                    System.out.println("See you  next time! ");
//                    work = false;
//                    break;
//                default:
//                    list.add(Integer.parseInt(st[1]), st[0 ]);
//            }
//        }
//    }
//    static void ex2() {
///*
//Принимает от пользователя и “запоминает” строки.
//Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//Если введено revert, удаляет предыдущую введенную строку из памяти.
//*/
//        Scanner scanner = new Scanner(System.in);
//        boolean work = true;
//        LinkedList<String> list = new LinkedList<>();
//        while (work) {
//            System.out.println("Введите команду");
//            String line = scanner.nextLine();
//            switch (line) {
//                case "print":
//                    ListIterator<String> iterator = list.listIterator(list.size());
//                    while (iterator.hasPrevious()) {
//                        System.out.println(iterator.previous());
//                    }
//                    break;
//                case "exit":
//                    System.out.println("До новых встреч");
//                    work = false;
//                    break;
//                case "revert":
//                    list.removeLast();
//                    break;
//            }
//        }
//    }
//
//
//}
