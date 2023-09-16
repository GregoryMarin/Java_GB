package HW;

import CW.MyStack;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class HW_4sem {
    public static void main(String[] args) {
        task1();
    }

    static void task1(){
        /*
        Пусть дан LinkedList с несколькими элементами. Реализуйте метод, которы  вернет перевернутый список.
        Не обращаться к листу по индексам.
         */
        List<Integer> list1 = HW_Methods.createLinkedListInt(10, 1, 200);
        System.out.println(list1);
        Collections.reverse(list1);
        System.out.println(list1);
    }

    static void task2(){
        /*
        Реализуйте очередь с помощью LinkedList со следующими методами:
        enqueue
         */
    }
}
