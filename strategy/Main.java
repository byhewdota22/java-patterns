package strategy;

public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment(1000);
        payment.setPaymentStrategy(new CashPayment());
        payment.process();
        payment.setPaymentStrategy(new CardPayment());
        payment.process();
        Payment payment2 = new Payment(500);
        payment2.process(); 
    }
}