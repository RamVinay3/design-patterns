package behavarioualPatterns.statePattern;

public class OutForDeliverState implements OrderState{

    @Override
    public void next(OrderContext context) {
       context.setState(new DeliveredState());
       System.out.println("Delivered the product");
    }

    @Override
    public void cancel(OrderContext orderContext) {
       orderContext.setState(new Cancel());
    }

    @Override
    public String getStateName() {
        return "Out For Delivery";
    }

    
    
}
