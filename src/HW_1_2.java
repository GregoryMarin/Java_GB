import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class HW_1_2 {
    public static void main(String[] args) {
        /*
        Задан целочисленный список ArrayList.
        Найти минимальное, максимальное и среднее арифметическое из этого списка. Collections.max()
         */

        int[] array = createArray(20, 1, 100);
        List<Integer> max_num = Arrays.stream(array).boxed().toList();
        System.out.println(Arrays.toString(array));
        System.out.println(Collections.max(max_num));
    }

    static int[] createArray(int size, int min,  int max){
        Random rnd = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rnd.nextInt(min, max);
        }
        return arr;
    }

}
