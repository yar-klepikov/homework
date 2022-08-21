package homework_1;

public class exercise_4 {
    /*Напишите программу, которая формирует два массива (не обязательно одинакового размера) целых чисел. Программа возвращает массив значений, которые присутствуют в первом массиве, но не присутствуют во втором.
     *Программа возвращает двумерный массив значений. В первом кортеже массив значений, которые присутствуют в первом массиве, но не присутствуют во втором. Во втором кортеже массив значений, которые присутствуют во втором массиве, но не присутствуют в первом.
     */

    // Списки совсем не понмню надо повторять, как то вот так кустрано, еси чесно то надо сильно повторять основы)) надеюсь что хотябы рядом)

    public static void main(String[] args) {
        int[] myArray = new int[20];
        int[] myArray2 = new int[20];
        int[] doNotRepeat = new int[20];
        int[] doNotRepeat2 = new int[20];
        //   int[][] together = new[20][20];
        for (int i = 1; i < 20; i++) {
            myArray[i] = i + 3;
            myArray2[i] = i + 10;
            //  System.out.println(myArray[i]);
            //  System.out.println(myArray2[i]);

        }
        int a = 0;
        int b = 0;
        for (int i = 0; i < 20; i++) {

            for (int e = 0; e < 20; e++) {
                if (myArray[i] == myArray2[e]) {
                    break;
                }
                if (e == 19) {
                    doNotRepeat[a] = myArray[i];
                    a++;
                }
            }
        }
        for (int i = 1; i < 20; i++) {

            for (int e = 1; e < 20; e++) {
                if (myArray2[i] == myArray[e]) {
                    break;
                }
                if (e == 19) {
                    doNotRepeat2[b] = myArray2[i];
                    b++;
                }
            }
        }
        System.out.println("first");
        for (int i = 0; i < 20; i++) {
            if (doNotRepeat[i] != 0) {
                System.out.println((i + 1)+ " = " + doNotRepeat[i]);
            }
        }
        System.out.println("second");
        for (int i = 0; i < 20; i++) {
            if (doNotRepeat2[i] != 0) {
                System.out.println((i + 1) + " = " + doNotRepeat2[i]);
            }
        }
    }
}
