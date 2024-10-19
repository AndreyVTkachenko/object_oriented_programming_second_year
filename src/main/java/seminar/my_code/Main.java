package seminar.my_code;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        WaterBottle waterBottle1 = new WaterBottle("Evian", 1.50, 10, 0.5);
        WaterBottle waterBottle2 = new WaterBottle("Evian", 2.00, 5, 1.0);
        WaterBottle waterBottle3 = new WaterBottle("Aqua", 1.00, 5, 0.75);

        WaterBottleVendingMachine vendingMachine = new WaterBottleVendingMachine();
        vendingMachine.initProducts(Arrays.asList(waterBottle1, waterBottle2, waterBottle3));

        Product product = vendingMachine.getProduct("Evian");
        if (product != null) {
            System.out.println("Куплен продукт: " + product);
        }

        Product specificProduct = vendingMachine.getProduct("Evian", 1.0);
        if (specificProduct != null) {
            System.out.println("Куплен продукт: " + specificProduct);
        }
    }
}
