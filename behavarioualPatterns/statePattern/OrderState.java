package behavarioualPatterns.statePattern;

public interface OrderState {
    void next(OrderContext orderContext);
    void cancel(OrderContext orderContext);
    String getStateName();
    
}