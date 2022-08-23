package homework_1;

import java.util.Scanner;

public class exercise_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number from 100 to 999:");
            int number = scan.nextInt();
            if (number < 100 || number > 999) {
                System.out.println("The number is less than one hundred.");
                continue;
            }
            int a = number % 10;
            int b = (number / 10) % 10;
            int c = number / 100;
            if (number > 500) {
                number = (a * 100) + (b * 10) + c;
                System.out.println(number);
                break;
            }
            number = (c * 100) + (a * 10) + b;
            System.out.println(number);
            break;
        }
    }
}
