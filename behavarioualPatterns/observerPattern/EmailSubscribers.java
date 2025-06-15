package behavarioualPatterns.observerPattern;

public class EmailSubscribers implements Subscriber {

    private String username;
    EmailSubscribers(String username){
        this.username=username;
    }

    @Override
    public void update(String name){
        System.out.println(username +" is notified about "+ name);
    }
    
    
}
