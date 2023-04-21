import java.util.Arrays;
import java.util.Random;

public class generator_nums {
    public static void main(String[] args) {
        int [] randomArray = generateArray(20, 0, 1 );
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
}
