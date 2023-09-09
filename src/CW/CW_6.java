package CW;/*
Вводится массив, сначала количество элементов, затем сами элементы. Найдите сумму его элементов с четными индексами
и выведите ее. А затем выведите числа, которые суммировались.
Simple input:
4
1
2
3
4
Simple output:
4
1
3

 */
import java.util.Scanner;

public class CW_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a count of elements you want: ");
        int count = Integer.parseInt(sc.nextLine());
        int[] array = new int[count];
        int sum_numbers = 0;
        for (int i = 0; i < count; i++) {
            System.out.println("Element " + (i+1) + ":");
            array[i] = Integer.parseInt(sc.nextLine());
            if (i % 2 == 0) {
                sum_numbers += array[i];
            }
        }
        System.out.println(sum_numbers);
        for (int i = 0; i < count; i+=2) {
            System.out.println(array[i]);
        }
    }
}
