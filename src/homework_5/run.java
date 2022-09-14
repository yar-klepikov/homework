package homework_5;


public class run {


    public static void main(String[] args) {
        Auto auto = new Auto();
        Moto moto = new Moto();
        Cargo cargo = new Cargo();
        moto.getData();
        Moto.MachineLoading<Integer, String> motoLoading = new Moto.MachineLoading<>(moto.passengers, moto.weight);
        System.out.println("number of passengers: " + motoLoading.getPassengers());
        System.out.println("Additional weight: " + motoLoading.getWeight());
        System.out.println("--------------------");
        auto.getData();
        Auto.MachineLoading<Integer, Integer> autoLoading = new Auto.MachineLoading<>(auto.passengers, auto.weight);
        System.out.println("number of passengers: " + autoLoading.getPassengers());
        System.out.println("Additional weight: " + autoLoading.getWeight());
        System.out.println("--------------------");
        cargo.getData();
        Cargo.MachineLoading<String, Integer> cargoLoading = new Cargo.MachineLoading<>(cargo.passengers, cargo.weight);
        System.out.println("number of passengers: " + cargoLoading.getPassengers());
        System.out.println("Additional weight: " + cargoLoading.getWeight());
        System.out.println("--------------------");



        //ToIntBiFunction<Boolean, Boolean, Boolean> testabc = (A, B, C) -> ((a + b) + c);
    }

}

