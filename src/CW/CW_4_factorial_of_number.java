package CW;

import java.util.Scanner;

public class CW_4_factorial_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a number: ");
        String f = sc.nextLine();
        int n = Integer.parseInt(f);
        var res = factorial(n);
        System.out.println(res);
    }
    static double factorial(int n) {
        if (n == 0) return 1;
        if (n == 1) return 1;
        return n * (factorial(n-1));
    }
}
