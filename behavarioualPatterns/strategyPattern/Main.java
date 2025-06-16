package behavarioualPatterns.strategyPattern;

public class Main {

    public static void main(){
        RideMatchingService ride=new RideMatchingService(new PriorityBasedStrategy());
        ride.matchRider("Hyderabad");
        //not getting good revenuen,we can always change pattern.
        ride.setStrategy(new AirportBasedStrategy());
        ride.matchRider("Hyderabad");
    }
    
}
