package homework_1;

import java.util.Scanner;


public class exercise_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sumWeight = 0;
        for (int i = 1; i <= 6; i++) {
            System.out.println("Enter passenger weight:");
            int weight = scan.nextInt();
            if (sumWeight + weight < 450) {
                sumWeight = weight + sumWeight;
            } else {
                System.out.println("Maximum weight exceeded" + "\n" +
                        "Total passenger weight: " + sumWeight + "\n" +
                        "Number of passengers: " + (i - 1));
                break;
            }
            if (i == 6) {
                System.out.println("Maximum number of passengers" + "\n" +
                        "Total passenger weight: " + sumWeight + "\n" +
                        "Number of passengers: " + i);
                break;
            }
        }
    }
}
