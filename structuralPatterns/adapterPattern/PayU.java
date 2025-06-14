package structuralPatterns.adapterPattern;

public class PayU implements PaymentGateway{
    @Override
    public void pay(String orderId,double amount){
        System.out.println("Paid Rs. " + amount + " using PayU for order: " + orderId);
    }
}
