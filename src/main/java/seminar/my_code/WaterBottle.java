package seminar.my_code;

public class WaterBottle extends Product {
    private double volume;

    public WaterBottle(String name, double price, int quantity, double volume) {
        super(name, price, quantity);
        this.volume = volume;
    }

    @Override
    public String getDescription() {
        return "Бутылка воды " + getName() + ", объем: " + volume + "л, цена: " + getPrice();
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "WaterBottle{name='" + getName() + "', price=" + getPrice() +
               ", quantity=" + getQuantity() + ", volume=" + volume + "л}";
    }
}
