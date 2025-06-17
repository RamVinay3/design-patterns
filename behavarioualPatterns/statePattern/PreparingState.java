package behavarioualPatterns.statePattern;

public class PreparingState implements OrderState{

    @Override
    public void next(OrderContext context) {
       context.setState(new OutForDeliverState());
       
    }

    @Override
    public void cancel(OrderContext orderContext) {
       
    }

    @Override
    public String getStateName() {
        return "Preparing the food";
    }

    
    
}
