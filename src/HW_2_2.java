import java.util.*;

/*Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор*/
public class HW_2_2 {
    public static void main(String[] args) {
        LinkedList<Integer> lst = HW_2_0.creatList(10,0,10);
        System.out.println(lst);
        Iterator<Integer> iter = lst.iterator();
        int sum =0;
        while (iter.hasNext()){
            sum += iter.next();
        }
        System.out.printf("Sum = %d",sum);
    }


}