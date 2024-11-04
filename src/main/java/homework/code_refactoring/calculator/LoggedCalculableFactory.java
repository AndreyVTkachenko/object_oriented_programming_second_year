package homework.code_refactoring.calculator;

public class LoggedCalculableFactory implements ICalculableFactory {

    private final Logger logger;

    public LoggedCalculableFactory(Logger logger) {
        this.logger = logger;
    }

    @Override
    public Calculable create(int primaryArg) {
        return new LoggedCalculator(new Calculator(primaryArg), logger);
    }
}
