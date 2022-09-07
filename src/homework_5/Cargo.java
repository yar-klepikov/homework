package homework_5;

public class Cargo extends Machine implements Machine.powerEngine, Machine.isTaxes {
    String passengers = "no";
    int weight = 50000;
    private String type = "Cargo";
    private int numberOfAxles = 2;
    private int power = powerEngine();
    private String license = license(numberOfAxles);
    private boolean taxes = isTaxes();

    protected void getData() {
        super.getData();
    }
    @Override
    public int powerEngine() {
        while (true) {
            power = (int) (Math.random() * 1000);
            if (power > 300 && power < 1500) {
                return power;
            }
        }
    }
    @Override
    public boolean isTaxes() {
        return true;
    }
    public boolean getTaxes() {
        return taxes;
    }
    public String getType() {
        return type;
    }
}
