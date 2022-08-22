package homework_1;

/* Напишите программу, которая выводит на экран все трехзначные числа, для которых соблюдаются два условия:
        • само число заканчивается на 0;
        • сумма нечетных делителей этого числа тоже заканчивается на 0.
 не уверен в том что просил вот это вот ))) но ка крешилось, завис с делителем, какие именно числа чичитть делителем, взял за условие все что меньне самого числа
*/

public class exercise_2 {

    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            if (i % 10 == 0) {
                int del = 1;
                int sumDel = 0;
                while (del < i) {
                    if (i % del == 0) {
                        sumDel = sumDel + del;
                    }
                    del = del + 2;
                }
                if (sumDel % 10 == 0) {
                    System.out.println("number" + i);
                    System.out.println("sum del" + sumDel);
                }
            }

        }
    }
}