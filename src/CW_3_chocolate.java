/* Задача2 Шоколадка.
Требуется определить, можно ли от шоколадки, размером m*n долек, отломить k долек. если разрешается делать только 1 разлом по прямой
между дольками (т.е. разломать шоколадку на 2 прямоугольника)
Вводится 3 числа: n, m, k, где к не равно n*m. Гарантируется, что количество долек в шоколадке не превышает 30000.
Программа должна вывести слово Yes, если возможно отломить указанное кол-во долек, в противном случае, вывести слово No
3 2 4
Yes

 */
import java.util.Scanner;

public class CW_3_chocolate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a chocolate size: ");
        String size = sc.nextLine();
        String[] word = size.split(" ");
        int width = Integer.parseInt(word[0]);
        int height = Integer.parseInt(word[1]);
        int peace = Integer.parseInt(word[2]);
        if (peace < width * height && ((peace % height == 0) || (peace % width == 0))){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
