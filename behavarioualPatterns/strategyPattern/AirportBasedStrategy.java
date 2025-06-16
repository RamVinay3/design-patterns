package behavarioualPatterns.strategyPattern;

public class AirportBasedStrategy implements MatchingStrategy {
    
    @Override
    public void match(String riderLocation){
         System.out.println("Matching using FIFO airport queue for  "+riderLocation);
    }
}
