package behavarioualPatterns.statePattern;


public class OrderPlaced implements OrderState{

    @Override
    public void next(OrderContext context) {
       context.setState(new PreparingState());
       
    }

    @Override
    public void cancel(OrderContext orderContext) {
       orderContext.setState(new Cancel());
    }

    @Override
    public String getStateName() {
        return "Order placed";
    }

    
    
}