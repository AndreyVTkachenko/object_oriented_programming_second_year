package seminar.my_code;

public class Human extends Actor {
    public Human(String name) {
        super(name);
    }

    @Override
    public void makeOrder() {
        if (!readyToOrder) {
            System.out.println(name + " теперь готов сделать заказ.");
            readyToOrder = true;
        }
        System.out.println(name + " сделал заказ.");
    }

    @Override
    public void receiveOrder() {
        if (readyToOrder && !orderReceived) {
            System.out.println(name + " получил заказ.");
            orderReceived = true;
            System.out.println(name + " подтвердил получение заказа.");
        } else if (orderReceived) {
            System.out.println(name + " уже подтвердил получение заказа.");
        } else {
            System.out.println(name + " не готов сделать заказ.");
        }
    }

    @Override
    public void setReadyToOrder(boolean ready) {
        this.readyToOrder = ready;
        if (ready) {
            System.out.println(name + " теперь готов сделать заказ.");
        } else {
            System.out.println(name + " больше не готов делать заказ.");
        }
    }

    @Override
    public boolean hasOrderReceived() {
        return orderReceived;
    }
}
