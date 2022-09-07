package homework_5;

public abstract class Machine {
    abstract int powerEngine();

    protected void getData() {
        System.out.println("Transport type: " + getType());
        System.out.println("Category of rights: " + getLicense());
        System.out.println("Power: " + power);
        if (getTaxes()) {
            System.out.println("Required");
        } else System.out.println("Not required");
        System.out.println("--------------------");
    }
    private String type;
    private int numberOfAxles = 6;
    private String license = license(numberOfAxles);
    private boolean taxes = false;
    int power = powerEngine();

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
        if (numberOfAxles > 4 && numberOfAxles < 6) {
            license = "B";
        } else if (numberOfAxles >= 6) {
            license = "C";
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


