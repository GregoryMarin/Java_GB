import java.time.LocalTime;
import java.util.Scanner;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        example();
        }
        static void example(){
        System.out.println("What is your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        LocalTime time = LocalTime.now();
        int hour = time.getHour();
        if (hour >=5 && hour < 12) {
            System.out.println("Good morning " + name + "!");
        } else if (hour < 18) {
            System.out.println("Good day " + name + "!");
        } else if (hour < 23) {
            System.out.println("Good evening " + name + "!");
        } else {
            System.out.println("Good night " + name + "!");
        }
    }
}

