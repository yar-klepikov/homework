package homework_3;

public class run {

    public static void main(String[] args) {
        exercise_3.Moto moto = new exercise_3().createMoto();
        exercise_3.Moto moto2 = new exercise_3().createMoto();
        System.out.println("__________________________-");
        System.out.println(moto.getType());
        System.out.println(moto.getPowerpower());
        System.out.println(moto.getNumberOfAxles());
        System.out.println(moto.getTaxes());
        System.out.println(moto.getLicense());
        System.out.println("__________________________-");
        System.out.println(moto2.getType());
        System.out.println(moto2.getPowerpower());
        System.out.println(moto2.getNumberOfAxles());
        System.out.println(moto2.getTaxes());
        System.out.println(moto2.getLicense());
        exercise_3.Auto auto = new exercise_3().createAuto();
        exercise_3.Auto auto2 = new exercise_3().createAuto();
        System.out.println("__________________________-");
        System.out.println(auto.getType());
        System.out.println(auto.getPowerpower());
        System.out.println(auto.getNumberOfAxles());
        System.out.println(auto.getTaxes());
        System.out.println(auto.getLicense());
        System.out.println("__________________________-");
        System.out.println(auto2.getType());
        System.out.println(auto2.getPowerpower());
        System.out.println(auto2.getNumberOfAxles());
        System.out.println(auto2.getTaxes());
        System.out.println(auto2.getLicense());
    }
}
