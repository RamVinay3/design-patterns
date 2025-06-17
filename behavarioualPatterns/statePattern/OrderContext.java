package behavarioualPatterns.statePattern;

public class OrderContext {
    private OrderState currentState;

    public OrderContext(){
        currentState=new OrderPlaced();
    }
    public void setState(OrderState orderState){
        this.currentState=orderState;
    }
    public void next(){
        this.currentState.next(this);
    }
    public void cancel(){
        this.currentState.cancel(this);
    }
    public String getStateName(){
        return this.currentState.getStateName();
    }
}
