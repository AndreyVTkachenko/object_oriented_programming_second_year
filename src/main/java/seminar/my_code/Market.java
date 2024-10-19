package seminar.my_code;

import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehaviour, MarketBehaviour {
    private List<Actor> queue;

    public Market() {
        queue = new ArrayList<>();
    }

    @Override
    public void addToQueue(Actor actor) {
        queue.add(actor);
        System.out.println(actor.getName() + " встал в очередь.");
    }

    @Override
    public void removeFromQueue(Actor actor) {
        queue.remove(actor);
        System.out.println(actor.getName() + " покинул очередь.");
    }

    @Override
    public void acceptOrder(Actor actor) {
        if (queue.contains(actor)) {
            actor.makeOrder();
        } else {
            System.out.println(actor.getName() + " не в очереди.");
        }
    }

    @Override
    public void giveOrder(Actor actor) {
        if (queue.contains(actor) && actor.isReadyToOrder() && !actor.hasOrderReceived()) {
            actor.receiveOrder();
        } else if (actor.hasOrderReceived()) {
            System.out.println(actor.getName() + " уже получил заказ.");
        } else {
            System.out.println(actor.getName() + " не готов получить заказ.");
        }
    }

    @Override
    public List<Actor> getQueue() {
        return queue;
    }

    @Override
    public void customerArrives(Actor actor) {
        System.out.println(actor.getName() + " пришел в магазин.");
        addToQueue(actor);
    }

    @Override
    public void customerLeaves(Actor actor) {
        removeFromQueue(actor);
        System.out.println(actor.getName() + " покинул магазин.");
    }
}
