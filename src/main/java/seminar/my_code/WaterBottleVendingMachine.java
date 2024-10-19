package seminar.my_code;

import java.util.List;

public class WaterBottleVendingMachine implements VendingMachine {
    private List<Product> products;

    @Override
    public void initProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public Product getProduct(String name) {
        // Поиск товара только по имени
        return products.stream()
                .filter(product -> product.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    public Product getProduct(String name, double volume) {
        return products.stream()
                .filter(product -> product.getName().equalsIgnoreCase(name) &&
                                   product instanceof WaterBottle &&
                                   ((WaterBottle) product).getVolume() == volume)
                .findFirst()
                .orElse(null);
    }
}
