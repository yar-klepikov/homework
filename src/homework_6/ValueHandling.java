package homework_6;
import java.util.List;

import static java.lang.System.*;

public class ValueHandling {
    public int[] setPoint(int count) {
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = ((int) (Math.random() * 6));
            if (array[i] <= 1) {
                array[i] = array[i] + 2;
            } else if (array[i] >= 6) {
                array[i]--;
            }
        }
        return array;
    }
    public static int setCorse() {
        int a = (int) (Math.random() * 5);
        if (a < 1) a++;
        if (a >5) a--;
        return a;
    }
    public static int setAverage(int[] arr) {
        int a = 0;
        for (int j : arr) {
            a = a + j;
        }
        a = a /10;
        return a;
    }
    public static void Transfer(List<Students> arr) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getAverage() < 3) {
                arr.remove(i);
                out.println(arr.get(i).getName() + " - Expel a student with an average score below 3");
            } else {
                arr.get(i).setCourse();
                out.println(arr.get(i).getName() + " - Student transferred to the next course, now in - " + arr.get(i).getCourse());
            }
        }
    }
    public static void printStudents(List<Students> students, int course) {
        out.println("Students list " + course + " course");
        for (Students student : students) {
            if (student.getCourse() == course) {
                out.print(student.getName());
                out.println(" " + student.getCourse());
            }
        }
    }
}