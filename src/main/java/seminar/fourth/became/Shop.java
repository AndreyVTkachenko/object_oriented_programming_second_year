package seminar.fourth.became;

import java.math.BigDecimal;

public class Shop {

    private Payment payment;

    public Shop(Payment payment) {
        this.payment = payment;
    }

    public void doPayment(Object order, BigDecimal amount) {
        payment.doTransaction(amount);
    }
}
