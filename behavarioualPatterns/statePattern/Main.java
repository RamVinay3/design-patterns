package behavarioualPatterns.statePattern;

public class Main {

    public static void main(){
        OrderContext order=new OrderContext();
        System.out.println(order.getStateName());
        order.next();
        System.out.println(order.getStateName());
        order.next();
        System.out.println(order.getStateName());
        order.next();
        System.out.println(order.getStateName());
        order.next();
        System.out.println(order.getStateName());
    }
    
}
