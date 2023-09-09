package HW;

import java.util.Arrays;
import java.util.Random;

public class HW_1 {
    public static void main(String[] args) {
        /*
        Пусть дан произвольный список целых чисел, удалить из него четные числа
         */
        int counter = 0;
        int[] array = createArray(10);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(del_natur_numbers(array)));
    }

    static int[] createArray(int size){
        Random rnd = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rnd.nextInt(1,10);
        }
        return arr;
    }

    static int[] del_natur_numbers(int[] arr){
        int[] new_arr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0){
                new_arr[i] = arr[i];
            }
        }
        return new_arr;
    }
}
