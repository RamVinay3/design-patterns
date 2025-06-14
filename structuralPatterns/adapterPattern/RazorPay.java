package structuralPatterns.adapterPattern;

public class RazorPay {

    public void makePayment(String orderId,double amount){
         System.out.println("Paid Rs. " + amount + " using RazorPay for order: " + orderId);

    }
    
}
