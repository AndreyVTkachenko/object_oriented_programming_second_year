package homework.code_refactoring.calculator;

public class CalculableFactory implements ICalculableFactory {
    @Override
    public Calculable create(int primaryArg) {
        return new Calculator(primaryArg);
    }
}