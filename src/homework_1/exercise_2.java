package homework_1;

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