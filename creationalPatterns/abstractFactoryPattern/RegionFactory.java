package creationalPatterns.abstractFactoryPattern;

//abstract factory
public interface RegionFactory {
    PaymentGateway createPaymentGateway(String mode);
    Invoice generateInvoice();
}


//concrete factory
class IndianFactory implements RegionFactory{
    public PaymentGateway createPaymentGateway(String mode){

        switch (mode.toUpperCase()) {
            case "RAZORPAY":
                return new RazorPay();
                
             case "PAYU":
             return new PayU();  
        
            default:
            throw new IllegalArgumentException("Unsupported gateway for India: " + mode);
                
        }

    }
    public Invoice generateInvoice(){
          return new GSTInvoice();

    }
}
//concrete factory
class USFactory implements RegionFactory{
    public PaymentGateway createPaymentGateway(String mode){
        switch (mode.toUpperCase()) {
            case "STRIPE":
                return new Stripe();
                
             case "PAYPAL":
             return new Paypal();  
        
            default:
            throw new IllegalArgumentException("Unsupported gateway for India: " + mode);
                
        }

    }
    public Invoice generateInvoice(){
        return new USInvoice();
    }
}