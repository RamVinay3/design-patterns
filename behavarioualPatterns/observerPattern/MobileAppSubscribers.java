package behavarioualPatterns.observerPattern;

public class MobileAppSubscribers  implements Subscriber{
     private String username;
    MobileAppSubscribers(String username){
        this.username=username;
    }
    @Override
    public void update(String name){
        System.out.println(username +" is notified about "+ name);
    }
}
