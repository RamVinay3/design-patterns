package behavarioualPatterns.strategyPattern;

public class PriorityBasedStrategy implements MatchingStrategy {

    @Override
    public void match(String riderLocation){
         System.out.println("Matching driver using surging priority  near  "+riderLocation);
         //prioritize high surge zones or premium zones
    }
    
}
