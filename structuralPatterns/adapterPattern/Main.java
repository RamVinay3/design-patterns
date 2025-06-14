package structuralPatterns.adapterPattern;

public class Main {

    public static void main(){
        CheckoutService c=new CheckoutService(new RazorPayAdaptor());//(new PayU());
        c.completeOrder("#order993389dkd2929kd", 23.45);
    }
    
}
