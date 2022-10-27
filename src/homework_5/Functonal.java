package homework_5;

import java.util.Scanner;
import java.util.function.Predicate;

public class Functonal {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите число:");
        int e = scanner.nextInt();
        Predicate<Integer> test = t -> t % 13 == 0;
        System.out.println("Возможно ли:" + test.test(e));

        System.out.println("Ведите 1 число:");
        double a = scanner.nextInt();
        System.out.println("Ведите 2 число:");
        double b = scanner.nextInt();
        System.out.println("Ведите 3 число:");
        double c = scanner.nextInt();



        Operation op = ()->{

            return a*a - 4* b *c;
        };
        System.out.println(op.calculate());
    }
    interface Operation{
        double calculate();
    }
}




