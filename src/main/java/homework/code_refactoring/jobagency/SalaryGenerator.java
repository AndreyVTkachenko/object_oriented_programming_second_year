package homework.code_refactoring.jobagency;

import java.util.Random;

// Генератор случайной зарплаты
public class SalaryGenerator {
    private final Random rnd = new Random();

    public int generate(int maxSalary) {
        return rnd.nextInt(maxSalary);
    }
}