package homework.code_refactoring.calculator;

import java.util.Scanner;

public class ViewCalculator {

    private final ICalculableFactory calculableFactory;

    public ViewCalculator(ICalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int primaryArg = promptInt(scanner, "Введите первый аргумент: ");
            Calculable calculator = calculableFactory.create(primaryArg);
            while (true) {
                String cmd = prompt(scanner, "Введите команду (*, +, =) : ");
                if (cmd.equals("*")) {
                    int arg = promptInt(scanner, "Введите второй аргумент: ");
                    calculator.multi(arg);
                    continue;
                }
                if (cmd.equals("+")) {
                    int arg = promptInt(scanner, "Введите второй аргумент: ");
                    calculator.sum(arg);
                    continue;
                }
                if (cmd.equals("=")) {
                    int result = calculator.getResult();
                    System.out.printf("Результат %d\n", result);
                    break;
                }
            }
            String cmd = prompt(scanner, "Еще посчитать (Y/N)?");
            if (!cmd.equalsIgnoreCase("Y")) {
                break;
            }
        }
        scanner.close();
    }

    private String prompt(Scanner scanner, String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    private int promptInt(Scanner scanner, String message) {
        System.out.print(message);
        return Integer.parseInt(scanner.nextLine());
    }
}

