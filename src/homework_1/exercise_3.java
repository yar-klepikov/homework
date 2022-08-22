package homework_1;

import java.util.Scanner;
/* В инструкции по пользованию лифтом в торговом центре написано: «Не более 6 человек или не более 450 кг». Перед входом в лифт установлен прибор, который подсчитывает входящих в лифт и определяет вес до входа в лифт. Прибор автоматически прекращает доступ к лифту, если вход очередного человека может нарушить инструкцию. Напишите программу, которая принимает с клавиатуры значения, каждое из которых - вес очередного человека, входящего в лифт. Ввод данных продолжается до тех пор, пока соблюдается требование, указанное в инструкции. Программа должна выводить на экран следующую итоговую информацию:
        • количество людей, вошедших в лифт;
        • общий их вес;
        • причина, по которой прекращен вход людей в лифт. */


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
