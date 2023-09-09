import java.util.*;

public class All_tasks {
    public static void main(String[] args) {
        ex_9();
    }

//    static void ex2(){
//        /* Заполнить список десятью случайными числами.
//        Отсортировать список методом sort() и вывести его на экран.
//        */
//
//        List<Integer> list = My_methods.createListInt(10, 4, 10);
//        System.out.println(list);
//        My_methods.sort(list);
//        System.out.println(list);
//    }

//    static void ex3(){
//        /*
//        Создать список типа ArrayList
//        Поместить в него как строки, так и целые числа.
//        Пройти по списку, найти и удалить целые числа.
//         */
//        List list = new ArrayList();
//        list.add(5);
//        list.add("5");
//        list.add(10);
//        list.add(10);
//        list.add("hello");
//        list.add(5.1);
//        list.add(null);
//        System.out.println(list);
//        My_methods.removeInteger2(list);
//        System.out.println(list);
//    }

//    static void ex4(){
//        /*
//        Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так, что на
//        0й позиции каждого внутреннего списка содержится название жанра, а на остальных позициях - названия книг.
//        Напишите метод для заполнения данной структуры.
//         */
//        List<List<String>> shopBook = new ArrayList<>();
//        My_methods.addBook(shopBook, "Детектив", "Шерлок Холмс");
//        My_methods.addBook(shopBook, "Детектив", "Убийство на Ниле");
//        My_methods.addBook(shopBook, "Фантастика", "Гарри Поттер");
//        My_methods.addBook(shopBook, "Роман", "Поющие в терновнике");
//        My_methods.addBook(shopBook, "Фантастика", "Ночной дозор");
//
//        System.out.println(shopBook);
//    }

//    static void hw1() {
//        /*
//        Пусть дан произвольный список целых чисел, удалить из него четные числа
//         */
//        List<Integer> list = My_methods.createListInt(15, 1, 100);
//        System.out.println(list);
//        My_methods.deleteNumbers(list);
//        System.out.println(list);
//
//    }

//    static void hw_2(){
//        /*
//        Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
//        Collections.max()
//         */
//        List<Integer> list = My_methods.createListInt(10, 1, 100);
//        System.out.println(list);
//        int max = Collections.max(list);
//        int min = Collections.min(list);
//        int counter = 0;
//        for (int i = 0; i < list.size(); i++) {
//            counter += list.get(i);
//        }
//        double average = counter / list.size() ;
//        System.out.println("Max: " + max + "  Min: " + min + "  Average: " + average);
//    }

//    static void hw_3(){
//        /*
//        Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
//        Вывести название каждой планеты и количество его повторений в списке.
//         */
//        List<String> planets = new ArrayList<>();
//        planets.add("Earth");
//        planets.add("Jupiter");
//        planets.add("Saturn");
//        planets.add("Mars");
//        planets.add("Earth");
//        planets.add("Mars");
//        planets.add("Jupiter");
//        planets.add("Saturn");
//        planets.add("Earth");
//
//        System.out.println(My_methods.countPlanets(planets, "Earth"));
//    }

//    static void ex_5(){
//        /*
//        Замерьте время, за которое в ArrayList добавятся 10000 элементов.
//        Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.
//         */
//
//        List<Integer> list1 = new ArrayList<>();
//        List<Integer> list2 = new LinkedList<>();
//
//        long timeStart = System.currentTimeMillis();
//        for (int i = 0; i < 100000; i++) {
//            list1.add(0, i);
//        }
//        long timeFinish = System.currentTimeMillis();
//        System.out.println(timeFinish - timeStart);
//    }

//    static void ex_6(){
//        /*
//        Реализовать консольное приложение, которое:
//        Принимает от пользователя строку вида text~num
//        Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
//        Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
//         */
//
//        Scanner sc = new Scanner(System.in);
//        boolean work = true;
//        LinkedList<String> list = new LinkedList<>();
//        while (work){
//            System.out.println("Write a command: ");
//            String command = sc.nextLine();
//            String[] splitLine = command.split("~");
//
//            switch (splitLine[0]) {
//                case "print":
//                    System.out.println(list.remove(Integer.parseInt(splitLine[1])));
//                    break;
//                case "exit":
//                    System.out.println("Hope to see you later!");
//                    work = false;
//                default:
//                    list.add(Integer.parseInt(splitLine[1]), splitLine[0]);
//            }
//        }
//    }

//    static void ex_7(){
//        /*
//        Принимает от пользователя и “запоминает” строки.
//        Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//        Если введено revert, удаляет предыдущую введенную строку из памяти.
//         */
//
//        Scanner sc = new Scanner(System.in);
//        boolean work = true;
//        LinkedList<String> list = new LinkedList<>();
//        while (work){
//            System.out.println("Write a command: ");
//            String line = sc.nextLine();
//            switch (line){
//                case "print":
//                    ListIterator<String> iterator = list.listIterator(list.size());
//                    while (iterator.hasPrevious()){
//                        System.out.println(iterator.previous());
//                    }
//                    break;
//                case "exit":
//                    System.out.println("Hope to see you again! ");
//                    work = false;
//                    break;
//                case "revert":
//                    list.removeLast();
//                    break;
//                default:
//                    list.add(line);
//            }
//        }
//
//
//    }

//    static void ex_8(){
//        /*
//        Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
//        2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.
//         */
//        Stack<Integer> stack = new Stack<>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//
//        while (!stack.isEmpty()){
//            System.out.println(stack.pop());
//        }
//
//        for (Integer integer: stack){
//            System.out.println(integer);
//        }
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);
//        queue.add(4);
//
//        for (Integer integer: queue){
//            System.out.println(integer);
//        }
//    }

    static void ex_9(){
        /*

         */

    }
}

