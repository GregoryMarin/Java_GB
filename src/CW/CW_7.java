package CW;/*
Дана строка, в которой через пробел перечислены цифры. На следующей строке вводится цифра.
Определите индексы первого и последнего её вхождения.
Sample Input:
4 5 3 5 2 6 4 6 6 8 1 2 3 8 4 0 9 7
4
Sample Output:
0
28

 */

public class CW_7 {
    public static void main(String[] args) {
        String str = "4 5 3 5 2 6 4 6 6 8 1 2 3 8 4 0 9 7";
        String num = "4";
        System.out.println(str.indexOf(num));
        System.out.println(str.lastIndexOf(num));
    }
}
