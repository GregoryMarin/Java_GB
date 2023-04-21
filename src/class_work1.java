import java.util.Scanner;

public class class_work1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a height:");
        String word = sc.nextLine();
        int h = Integer.parseInt(word);
        System.out.println("Write a first_number:");
        String word_1 = sc.nextLine();
        int a = Integer.parseInt(word_1);
        System.out.println("Write a second_number:");
        String word_2 = sc.nextLine();
        int b = Integer.parseInt(word_2);
        int start = 0;
        int counter = 1;
        while(start + a < h){
            counter ++;
            start = start + a - b;
        }
        System.out.println(counter);
    }
}
