package homework.code_refactoring.calculator;

public interface Calculable {
    Calculable sum(int arg);
    Calculable multi(int arg);
    int getResult();
}
