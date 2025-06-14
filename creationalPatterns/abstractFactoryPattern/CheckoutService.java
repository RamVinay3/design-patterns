package creationalPatterns.abstractFactoryPattern;

public class CheckoutService {

    private PaymentGateway gateway;
    private Invoice invoice;
    private String gatewayType;

    public CheckoutService(RegionFactory factory,String gatewayType){
        
        this.gatewayType=gatewayType;
        this.gateway=factory.createPaymentGateway(this.gatewayType);
        this.invoice=factory.generateInvoice();
    }
    public void completeOrder(double amount){
        
        gateway.processPayment(amount);
        invoice.generateInvoice();
    }
    
}
