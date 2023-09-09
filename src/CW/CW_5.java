package CW;/*
Напишите программу, которая выводит в столбик целые числа от а до б (а>=b) с шагом с
 */

import java.util.Scanner;

public class CW_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a first number: ");
        int n1 = Integer.parseInt(sc.nextLine());
        System.out.println("Write a second number: ");
        int n2 = Integer.parseInt(sc.nextLine());
        System.out.println("Write a step: ");
        int n3 = Integer.parseInt(sc.nextLine());
        for (int i = n1; i >= n2; i -= n3){
            System.out.println(i);
        }

    }
}
