// Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.


import java.util.Arrays;
import java.util.Random;

public class CW_2 {
    public static void main(String[] args) {
        int [] randomArray = generateArray(20, 0, 1 );
        System.out.println(count_ones(randomArray));
        System.out.println(Arrays.toString(randomArray));
    }
    static int[] generateArray(int size, int min_value, int max_value){
        int[] resultArray = new int[size];
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            resultArray[i] = rnd.nextInt(min_value, max_value+1);
        }
        return resultArray;

    }
    static int count_ones(int[] arr) {
        int temp = 0;
        int maxOnes = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                temp ++;
            }
            else {
                if (temp > maxOnes) {
                    maxOnes = temp;
                }
                temp = 0;
            }
        }
        return maxOnes == -1? 0: maxOnes;
    }
}