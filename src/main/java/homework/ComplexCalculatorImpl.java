package homework;

public class ComplexCalculatorImpl implements ComplexCalculator {

    @Override
    public ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        double real = a.getReal() + b.getReal();
        double imaginary = a.getImaginary() + b.getImaginary();
        AppLogger.getInstance().log("Adding: " + a + " + " + b + " = " + new ComplexNumber(real, imaginary));
        return new ComplexNumber(real, imaginary);
    }

    @Override
    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        double real = a.getReal() * b.getReal() - a.getImaginary() * b.getImaginary();
        double imaginary = a.getReal() * b.getImaginary() + a.getImaginary() * b.getReal();
        AppLogger.getInstance().log("Multiplying: " + a + " * " + b + " = " + new ComplexNumber(real, imaginary));
        return new ComplexNumber(real, imaginary);
    }

    @Override
    public ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
        double denominator = b.getReal() * b.getReal() + b.getImaginary() * b.getImaginary();
        double real = (a.getReal() * b.getReal() + a.getImaginary() * b.getImaginary()) / denominator;
        double imaginary = (a.getImaginary() * b.getReal() - a.getReal() * b.getImaginary()) / denominator;
        AppLogger.getInstance().log("Dividing: " + a + " / " + b + " = " + new ComplexNumber(real, imaginary));
        return new ComplexNumber(real, imaginary);
    }
}

