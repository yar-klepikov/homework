package homework_5;

public abstract class Machine {
    public static class MachineLoading<T, K> {
        private T passengers;
        private K weight;

        public MachineLoading(T passengers, K weight) {
            this.passengers = passengers;
            this.weight = weight;
        }

        public K getWeight() {
            return weight;
        }

        public T getPassengers() {
            return passengers;
        }

    }
    abstract int powerEngine();

    protected void getData() {
        System.out.println("Transport type" + getType());
        System.out.println("Category of rights: " + getLicense());
        System.out.println("Power: " + power);
        if (getTaxes()) {
            System.out.println("Required");
        } else System.out.println("Not required");
        System.out.println("--------------------");
    }

    private String type;
    private int numberOfAxles = 0;
    private String license = license(numberOfAxles);
    private boolean taxes = false;
    int power = powerEngine();


    public int getNumberOfAxles() {
        return numberOfAxles;
    }

    public String getType() {
        return type;
    }

    public boolean getTaxes() {
        return taxes;
    }

    public String getLicense() {
        return license;
    }

    public String license(int numberOfAxles) {
        this.numberOfAxles = numberOfAxles;
        if (numberOfAxles > 0 && numberOfAxles <= 3) {
            license = "A";
        } else if (numberOfAxles == 4) {
            license = "B";
        }
        return license;
    }

    protected interface powerEngine {
        int powerEngine();
    }

    protected interface isTaxes {
        boolean isTaxes();
    }
}


