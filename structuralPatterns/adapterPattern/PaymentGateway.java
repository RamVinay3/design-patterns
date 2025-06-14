package structuralPatterns.adapterPattern;

public interface PaymentGateway {
    void pay(String orderId,double amount);
}
