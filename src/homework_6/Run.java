package homework_6;
import java.util.ArrayList;
import java.util.List;

public class Run extends ValueHandling {

    public static void main(String[] args) {
        List<Students> list = new ArrayList<>();
        list.add(new Students("Anton",1));
        list.add(new Students("Vasya",1));
        list.add(new Students("Pasha",1));
        list.add(new Students("Macha",1));
        list.add(new Students("Slava",1));
        list.add(new Students("Lara",1));
        list.add(new Students("Mara",1));
        list.add(new Students("Klara",2));
        list.add(new Students("Sara",4));
        list.add(new Students("Dara",2));
        list.add(new Students("Nara",3));
        list.add(new Students("Gena",4));
        list.add(new Students("Che",2));
        list.add(new Students("Vol",5));
        list.add(new Students("Pol",3));
        list.add(new Students("Bob",2));
        Transfer(list);
        printStudents(list, 3);
    }
}