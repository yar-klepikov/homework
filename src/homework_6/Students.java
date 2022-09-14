package homework_6;

import java.util.Arrays;

public class Students extends ValueHandling {
    public final int COUNT = 10;
    private String name;
    private int course = setCorse();
    private int grope;
    int[] points = setPoint(COUNT);
    private int average = setAverage(points);


    public Students(String name, int grope) {
        this.name = name;
        this.grope = grope;
    }
    public String getName() {
        return name;
    }
    public int getCourse() {
        return course;
    }
    public int setCourse() {
        course = course + 1;
        return course;
    }
    public int getAverage() {
        return average;
    }
    public String getPoint() {
        return Arrays.toString(points);
    }
    public int getGrope() {
        return grope;
    }
}
