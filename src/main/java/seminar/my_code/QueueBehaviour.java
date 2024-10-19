package seminar.my_code;

import java.util.List;

public interface QueueBehaviour {
    void addToQueue(Actor actor);
    void removeFromQueue(Actor actor);
    void acceptOrder(Actor actor);
    void giveOrder(Actor actor);
    List<Actor> getQueue();
}
