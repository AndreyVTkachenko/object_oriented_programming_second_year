package lesson.example_04;

import lesson.example_04.ExBeverage.*;

// три вода
public class Program {
    public static void main(String[] args) {
        Coffee latte = new Coffee();
        latte.addComponent(new Water("вода"));
        latte.addComponent(new Water("вода"));
        latte.addComponent(new Water("вода"));
        for (Ingredient ingredient : latte) {
            System.err.println(ingredient);
        }
    }
}
