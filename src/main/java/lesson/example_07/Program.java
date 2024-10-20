package lesson.example_07;

// три вода
public class Program {
    public static void main(String[] args) {
        Coffee latte = new Coffee();
        latte.addComponent(new Water("вода"));
        latte.addComponent(new Water("вода"));
        latte.addComponent(new Water("вода"));
        latte.addComponent(new Milk("молоко"));
        for (Ingredient ingredient : latte) {
            System.err.println(ingredient);
        }
    }
}
