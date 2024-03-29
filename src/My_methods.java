import java.util.*;

public class My_methods {
    public static void main(String[] args) {
    }

    static LinkedList<Integer> createListInt(int capacity, int min, int max){
        LinkedList<Integer> result = new LinkedList<>();
        for (int i = 0; i < capacity; i++) {
            result.add((int)(Math.random() * (max - min + 1) + min));
        }
        return result;
    }

    static void removeInteger(List list){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Number){
                list.remove(i);
                i--;
            }
        }
    }

    static void removeInteger2(List list){
        Iterator it = list.listIterator();
        while (it.hasNext()){
            Object ob = it.next();
            if (ob instanceof Integer){
                it.remove();
            }
        }
    }

    static void sort(List<Integer> list){
        Collections.sort(list, Comparator.reverseOrder());
    }

    static int countPlanets(List<String> pl, String st){
        int counter = 0;
        for (int i = 0; i < pl.size(); i++) {
            if(pl.get(i).equalsIgnoreCase(st)){
                counter++;
            }
        }
        return counter;
    }

    static List<Integer> deleteNumbers(List<Integer> lm ){
        for (int i = 0; i < lm.size(); i++) {
            if (lm.get(i) % 2 == 0){
                lm.remove(i);
            }
        }
        return lm;
    }

    static void addBook2(List<List<String>> books, String genre, String name){
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).get(0).equalsIgnoreCase(genre)){
                books.get(i).add(name);
            }
        }
        List<String> list = new ArrayList<>();
        list.add(genre);
        list.add(name);
        books.add(list);
    }

    static void addBook(List<List<String>> shopBook, String genre, String name){
        for (int i = 0; i < shopBook.size(); i++) {
            if (shopBook.get(i).get(0).equalsIgnoreCase(genre)){
                List<String> list = shopBook.get(i);
                list.add(name);
                return;
            }
        }
        List<String> list = new ArrayList<>();
        list.add(genre);
        list.add(name);
        shopBook.add(list);
    }

    static int[] generateArray(int size, int min_value, int max_value) {
        int[] resultArray = new int[size];
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            resultArray[i] = rnd.nextInt(min_value, max_value + 1);
        }
        return resultArray;
    }

    static LinkedList<Integer> reverselst (LinkedList<Integer> lst){
        LinkedList<Integer> lst2 = new LinkedList<>();
        for (int i = 0; i < lst.size(); i++) {
            while (!lst.isEmpty()){
                lst2.addFirst(lst.pop());
            }
        }
        return lst2;
    }

    static void enqueue(LinkedList<Integer> list, int item){
        list.add(item);
    }

    static int dequeue(LinkedList<Integer> lst){
        return lst.removeFirst();
    }

    static int first (LinkedList<Integer> lst){
        return lst.getFirst();
    }
}

