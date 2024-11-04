package homework.code_refactoring.calculator;

public class Main {
    public static void main(String[] args) {
        Logger logger = new ConsoleLogger();
        ICalculableFactory calculableFactory = new LoggedCalculableFactory(logger);
        ViewCalculator view = new ViewCalculator(calculableFactory);
        view.run();
    }
}
