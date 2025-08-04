package pizzashop;

    public class Pizza {
        private static final int MAX_TOPPING = 10;
        private final String[] toppings;
        private int totalToppings;

        public Pizza() {
            toppings = new String[MAX_TOPPING];
            totalToppings = 0;
        }

        public void addTopping(String topping) {
            if (totalToppings < MAX_TOPPING) {
                toppings[totalToppings] = topping;
                totalToppings++;
            } else {
                System.out.println("เครื่องปรุงเยอะเกินครับพี่");
            }
        }

        public int getTotalToppings() {
            return totalToppings;
        }

        public int calculatePrice() {
            return 100 + (totalToppings * 10);
        }

        public void printAllTopping() {
            if (totalToppings == 0) {
                System.out.println("ไม่ใส่เครื่องปรุง แน่ใจใช่ไหม..ใช่ไหม...");
                return;
            }

            System.out.println("รายการเครื่องปรุงที่ใส่ : ");
            for (int i = 0; i < totalToppings; i++) {
                System.out.println("- " + toppings[i]);
            }
        }
    }



