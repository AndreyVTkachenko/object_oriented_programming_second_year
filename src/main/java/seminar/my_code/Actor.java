package seminar.my_code;

public abstract class Actor implements ActorBehavior {
    protected String name;
    protected boolean readyToOrder;
    protected boolean orderReceived;

    public Actor(String name) {
        this.name = name;
        this.readyToOrder = false;
        this.orderReceived = false;
    }

    public String getName() {
        return name;
    }

    public boolean isReadyToOrder() {
        return readyToOrder;
    }

    public boolean hasOrderReceived() {
        return orderReceived;
    }

    @Override
    public void makeOrder() {
        readyToOrder = true;
    }

    @Override
    public void receiveOrder() {
        if (readyToOrder) {
            orderReceived = true;
            System.out.println(name + " получил заказ.");
        } else {
            System.out.println(name + " не готов сделать заказ.");
        }
    }

    public void resetOrderStatus() {
        readyToOrder = false;
        orderReceived = false;
    }
}
