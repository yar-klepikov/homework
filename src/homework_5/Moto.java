package homework_5;

public class Moto extends Machine implements Machine.powerEngine, Machine.isTaxes {
    int passengers = 2;
    String weight = "no";
    private String type = "Moto";
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
            power = (int) (Math.random() * 150);
            if (power > 30 && power < 150) {
                return power;
            }
        }
    }
    @Override
    public boolean isTaxes() {
        return power > 110;
    }
    public boolean getTaxes() {
        return taxes;
    }
    public String getType() {
        return type;
    }
}
