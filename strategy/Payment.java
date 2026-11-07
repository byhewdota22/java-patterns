package strategy;

public class Payment {
private final double amount;
private PaymentStrategy paymentStrategy;
public Payment(double amount) {
	this.amount = amount;
}
public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
	this.paymentStrategy = paymentStrategy;
}
public void process() {
	if(paymentStrategy == null) {
		System.out.println("Сперва выберите способ оплаты");
		return;
	}
	paymentStrategy.pay(amount);
}
}
