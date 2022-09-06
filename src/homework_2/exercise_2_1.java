package homework_2;

import java.util.Scanner;

public class exercise_2_1 {

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int centr_x = scann.nextInt();
        int centr_y = scann.nextInt();
        int radius = scann.nextInt();
        int x = scann.nextInt();
        int y = scann.nextInt();

        if (Raz(x, y, centr_x, centr_y, radius)) {
            System.out.println("in a circle");
        } else {
            System.out.println("outside the circle");


        }
    }

    static boolean Raz(double x, double y, double centr_x, double centr_y, double r) {
        double xa = (x - centr_x)*(x - centr_x);
        double ya = (y - centr_y)*(y - centr_y);
        return (Math.sqrt(xa + ya)) <= r;
    }
}
