import java.util.ArrayList;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Write a number: ");
            numbers.add(sc.nextInt());
        }

        for(Integer el : numbers){
            System.out.println("Element" + ": " + el);
        }
    }
}
