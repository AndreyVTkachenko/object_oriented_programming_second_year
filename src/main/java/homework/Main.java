package homework;

public class Main {
    public static void main(String[] args) {
        ComplexCalculator calculator = new ComplexCalculatorImpl();

        ComplexNumber num1 = new ComplexNumber(1.0, 2.0);
        ComplexNumber num2 = new ComplexNumber(3.0, 4.0);

        ComplexNumber sum = calculator.add(num1, num2);
        System.out.println("Sum: " + sum);

        ComplexNumber product = calculator.multiply(num1, num2);
        System.out.println("Product: " + product);

        ComplexNumber quotient = calculator.divide(num1, num2);
        System.out.println("Quotient: " + quotient);
    }
}

