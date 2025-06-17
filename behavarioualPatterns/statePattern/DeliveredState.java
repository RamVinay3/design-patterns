package behavarioualPatterns.statePattern;

public class DeliveredState   implements OrderState{

    @Override
    public void next(OrderContext context) {
       System.out.println("product was Delivered ");
    }

    @Override
    public void cancel(OrderContext orderContext){
       System.out.println("The item has been delivered . Cannot cancel now");
    }

    @Override
    public String getStateName() {
        return "Delivered";
    }

    
    
}

