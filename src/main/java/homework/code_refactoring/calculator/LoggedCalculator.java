package homework.code_refactoring.calculator;

public class LoggedCalculator implements Calculable {

    private final Calculable wrapped;
    private final Logger logger;

    public LoggedCalculator(Calculable wrapped, Logger logger) {
        this.wrapped = wrapped;
        this.logger = logger;
    }

    @Override
    public Calculable sum(int arg) {
        logger.log("Выполняется операция сложения с аргументом: " + arg);
        wrapped.sum(arg);
        return this;
    }

    @Override
    public Calculable multi(int arg) {
        logger.log("Выполняется операция умножения с аргументом: " + arg);
        wrapped.multi(arg);
        return this;
    }

    @Override
    public int getResult() {
        int result = wrapped.getResult();
        logger.log("Результат: " + result);
        return result;
    }
}


