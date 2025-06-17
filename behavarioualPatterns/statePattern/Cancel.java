package behavarioualPatterns.statePattern;

public class Cancel implements OrderState{

    @Override
    public void next(OrderContext context) {
       System.out.println("We cannot do anything.please re-order the item");
       
    }

    @Override
    public void cancel(OrderContext orderContext) {
       System.out.println("The order was already cancelled");
    }

    @Override
    public String getStateName() {
        return "Order placed";
    }

    
    
}