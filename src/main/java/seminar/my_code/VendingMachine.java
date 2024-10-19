package seminar.my_code;

import java.util.List;

public interface VendingMachine {
    void initProducts(List<Product> products);
    Product getProduct(String name);
}
