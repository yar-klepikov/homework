package homework_3;

public class exercise_3 {

    public Moto createMoto() {
        return new Moto();
    }

    public Auto createAuto() {
        return new Auto();
    }

    abstract class Machine {
        private String type;
        private int numberOfAxles = 0;
        private String license = license(numberOfAxles);
        private boolean taxes;

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
    }

    private interface powerEngine {
        int powerEngine();
    }

    private interface isTaxes {
        boolean isTaxes();
    }

    public class Moto extends Machine implements powerEngine, isTaxes {

        private String type = "Moto";
        private int numberOfAxles = 2;
        private int power = powerEngine();
        private String license = license(numberOfAxles);
        private boolean taxes = isTaxes();


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

        public int getPowerpower() {
            return power;
        }

        public boolean getTaxes() {
            return taxes;
        }

        public String getType() {
            return type;
        }
    }

    public class Auto extends Machine implements powerEngine, isTaxes {

        private String type = "Auto";
        private int numberOfAxles = 4;
        private int power = powerEngine();
        private String license = license(numberOfAxles);
        boolean taxes = isTaxes();

        @Override
        public int powerEngine() {
            while (true) {
                power = (int) (Math.random() * 500);
                if (power > 90 && power < 2000) {
                    return power;
                }
            }
        }

        public boolean isTaxes() {
            return power > 250;
        }
        
        public int getPowerpower() {
            return power;
        }

        public boolean getTaxes() {
            return taxes;
        }

        public String getType() {
            return type;
        }
    }
}





