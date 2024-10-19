package homework;

import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine {
    private List<Product> products;

    @Override
    public void initProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public Product getProduct(String name) {
        return products.stream()
                .filter(product -> product.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    public Product getProduct(String name, int volume, int temperature) {
        return products.stream()
                .filter(product -> product instanceof HotDrink)
                .map(product -> (HotDrink) product)
                .filter(hotDrink -> hotDrink.getName().equalsIgnoreCase(name) &&
                                    hotDrink.getVolume() == volume &&
                                    hotDrink.getTemperature() == temperature)
                .findFirst()
                .orElse(null);
    }
}

