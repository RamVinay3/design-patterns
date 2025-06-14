package creationalPatterns.abstractFactoryPattern;


public interface RegionFactory {
    PaymentGateway createPaymentGateway(String mode);
    Invoice generateInvoice();
}


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