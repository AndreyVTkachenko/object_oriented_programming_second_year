package homework;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Создание горячих напитков
        HotDrink coffee = new HotDrink("Кофе", 2.50, 10, 250, 80);
        HotDrink tea = new HotDrink("Чай", 1.75, 8, 200, 75);
        HotDrink cocoa = new HotDrink("Какао", 2.00, 5, 300, 85);

        // Инициализация автомата
        HotDrinkVendingMachine vendingMachine = new HotDrinkVendingMachine();
        vendingMachine.initProducts(Arrays.asList(coffee, tea, cocoa));

        // Покупка напитка по имени
        Product product = vendingMachine.getProduct("Кофе");
        if (product != null) {
            System.out.println("Куплен продукт: " + product);
        }

        // Покупка напитка по имени, объему и температуре
        Product specificProduct = vendingMachine.getProduct("Чай", 200, 75);
        if (specificProduct != null) {
            System.out.println("Куплен продукт: " + specificProduct);
        }

        // Попытка купить несуществующий напиток
        Product nonExistingProduct = vendingMachine.getProduct("Эспрессо", 150, 90);
        if (nonExistingProduct != null) {
            System.out.println("Куплен продукт: " + nonExistingProduct);
        } else {
            System.out.println("Товар не найден.");
        }
    }
}

