package seminar.seminar_code;

public interface VendingMachine {
    Product getProduct(String name) throws IllegalStateException;
}
