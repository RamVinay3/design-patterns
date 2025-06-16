package behavarioualPatterns.strategyPattern;

public class NearestDrivingStrategy implements MatchingStrategy {

    @Override
    public void match(String riderLocation){
        //distance based search
        System.out.println("Matching with nearest available drivers to "+riderLocation);
    }
    
}
