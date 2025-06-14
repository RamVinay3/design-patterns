package structuralPatterns.adapterPattern;
/*
 * If client wants to move to razorpay instead of payU ,
 * we cannot use it because checkout Service is expecting PaymentGateway whereas 
 * Razorpay is not implementing it and the functions also different so in this case
 * we will create another class and implements the interface inside methods we call the methods which make sense 
 * for the respective implementation
 */
public class RazorPayAdaptor implements PaymentGateway{
    private RazorPay razorPay;

   public RazorPayAdaptor(){
    razorPay=new RazorPay();

    }
    @Override
    public void pay(String orderId,double amount){
        razorPay.makePayment(orderId, amount);
    }
    
}
/*now to use the razorPay we can repalce with this class Adaptor
*we didn't change anything related to razorpay nor client code
* we added another extra code so that they will be compatible.
*/
