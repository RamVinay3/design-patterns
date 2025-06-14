package structuralPatterns.adapterPattern;

public class CheckoutService {

    private PaymentGateway paymentGateway;
    CheckoutService(PaymentGateway paymentGateway){
        this.paymentGateway=paymentGateway;
    }
    public void completeOrder(String orderId,double amount){
        paymentGateway.pay(orderId,amount);
    }
    
}
