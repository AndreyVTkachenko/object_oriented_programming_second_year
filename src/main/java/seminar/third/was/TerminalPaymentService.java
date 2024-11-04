package seminar.third.was;

public class TerminalPaymentService implements Payment{
    @Override
    public void payCreditCard() {
        // logic
    }

    @Override
    public void payPhoneNumber() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
