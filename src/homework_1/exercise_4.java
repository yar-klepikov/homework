package homework_1;

public class exercise_4 {
static final public int number = 20;
    public static void main(String[] args) {
        int[] myArray = new int[number];
        int[] myArray2 = new int[number];
        int[] doNotRepeat = new int[number];
        int[] doNotRepeat2 = new int[number];
        for (int i = 1; i < 20; i++) {
            myArray[i] = i + 3;
            myArray2[i] = i + 10;
            //  System.out.println(myArray[i]);
            //  System.out.println(myArray2[i]);

        }
        int a = 0;
        int b = 0;
        for (int i = 0; i < number; i++) {

            for (int e = 0; e < number; e++) {
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

            for (int e = 1; e < number; e++) {
                if (myArray2[i] == myArray[e]) {
                    break;
                }
                if (e == number-1) {
                    doNotRepeat2[b] = myArray2[i];
                    b++;
                }
            }
        }
        System.out.println("first");
        for (int i = 0; i < number; i++) {
            if (doNotRepeat[i] != 0) {
                System.out.println((i + 1) + " = " + doNotRepeat[i]);
            }
        }
        System.out.println("second");
        for (int i = 0; i < number; i++) {
            if (doNotRepeat2[i] != 0) {
                System.out.println((i + 1) + " = " + doNotRepeat2[i]);
            }
        }
    }
}

