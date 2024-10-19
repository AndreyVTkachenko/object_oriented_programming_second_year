package seminar.my_code;

public class Main {
    public static void main(String[] args) {

        Market market = new Market();
        Actor human1 = new Human("Сергей");
        Actor human2 = new Human("Николай");
        Actor human3 = new Human("Александр");

        market.customerArrives(human1); // Сергей пришел в магазин.
        market.customerArrives(human2); // Николай пришел в магазин.
        market.customerArrives(human3); // Александр пришел в магазин.

        // Сергей делает заказ
        market.acceptOrder(human1); // Сергей теперь готов сделать заказ.
        market.giveOrder(human1); // Сергей получает заказ.

        // Николай делает заказ
        market.acceptOrder(human2); // Николай теперь готов сделать заказ.
        market.giveOrder(human2); // Николай получает заказ.

        // Александр просто смотрит и уходит
        market.customerLeaves(human3); // Александр покинул магазин.

        // Удаляем обоих из очереди
        market.customerLeaves(human1); // Сергей покинул магазин.
        market.customerLeaves(human2); // Николай покинул магазин.
    }
}
