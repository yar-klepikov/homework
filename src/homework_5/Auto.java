package homework_5;

public class Auto extends Machine implements Machine.powerEngine {
    int passengers = 4;
    int weight = 200;
        private String type = "Auto";
        private int numberOfAxles = 4;
        private int power = powerEngine();
        private String license = license(numberOfAxles);
        boolean taxes = isTaxes();

        @Override
        protected void getData(){
        super.getData();
    }

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
            return power > 300;
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
