package homework_1;

import java.util.Scanner;

public class exercise_1 {

    /*Напишите программу, которая принимает с клавиатуры целое трехзначное положительное число и изменяет его следующим образом:
    • для чисел, больших 500, - переставляет местами числа единиц и сотен (вместо 672 - 276);
    • в остальных числах переставляются местами числа десятков и единиц (вместо 363 - 336).
    Программа должна вывести на экран новое значение переменной.
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) { // цикл не нужен но с ним было проще несколько значений сразу проверять, можно и без него
            System.out.println("Enter a number from 100 to 999:");
            int number = scan.nextInt();
            if (number < 100 || number > 999) {
                System.out.println("The number is less than one hundred.");
                continue;
            }
            int a = number % 10;    // для упрощения выделил все в еденичые знения
            int b = (number / 10) % 10;
            int c = number / 100;
            if (number > 500) {
                number = (a * 100) + (b * 10) + c; // меняем местами сотни и еденицы
                System.out.println(number);
                break;
            }
            number = (c * 100) + (a * 10) + b; // меняем местами десятки и еденицы
            System.out.println(number);
            break;
        }
    }
}
