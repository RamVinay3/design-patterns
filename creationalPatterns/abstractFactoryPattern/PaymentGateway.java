package creationalPatterns.abstractFactoryPattern;

public interface PaymentGateway {
    void processPayment(double amount);
    
}

//Indian Gateways
 class RazorPay implements PaymentGateway{
    public void processPayment(double amount){
        System.out.println("RazorPay  processed your order "+amount);
    }
   
    
} 

class PayU implements PaymentGateway{
    public void processPayment(double amount){
        System.out.println("payU processed your order "+amount);
    }
}

//Us gateways
 class Paypal implements PaymentGateway{
    public void processPayment(double amount){
        System.out.println("Paypal  processed your order "+amount);
    }
    
} 

class Stripe implements PaymentGateway{
    public void processPayment(double amount){
        System.out.println("Stripe processed your order "+amount);
    }
    
}