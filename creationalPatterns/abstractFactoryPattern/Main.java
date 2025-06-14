package creationalPatterns.abstractFactoryPattern;

public class Main {
     // Using Razorpay in India
       public static void main(String[] args){
         CheckoutService india=new CheckoutService(new IndianFactory(),"razorPay" );
        india.completeOrder(789.90);

          CheckoutService usCheckout = new CheckoutService(new USFactory(), "paypal");
            usCheckout.completeOrder(49.99);
       }
}
