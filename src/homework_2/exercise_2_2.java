package homework_2;

import java.util.Scanner;

public class exercise_2_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(inOrder(num));
    }

    public static String inOrder(int n) {
        if (n < 10) {
            return Integer.toString(n);
        }
        else {
            return inOrder(n / 10) + "\n" + n % 10;
        }
    }
}
