package homework;

public class HotDrink extends Product {
    private int volume;
    private int temperature;

    public HotDrink(String name, double price, int quantity, int volume, int temperature) {
        super(name, price, quantity);
        this.volume = volume;
        this.temperature = temperature;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String getDescription() {
        return "Горячий напиток " + getName() + ", объем: " + volume + " мл, температура: " + temperature + "°C, цена: " + getPrice();
    }

    @Override
    public String toString() {
        return "HotDrink{name='" + getName() + "', price=" + getPrice() +
               ", quantity=" + getQuantity() + ", volume=" + volume +
               " мл, температура=" + temperature + "°C}";
    }
}

