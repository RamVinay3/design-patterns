package behavarioualPatterns.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Channel{
    private String name;
    List<Subscriber> subscribers;

    YoutubeChannel(String name){
        this.name=name;
        subscribers=new ArrayList<>();
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unSubscribe(Subscriber subscriber) {
       subscribers.remove(subscriber);
    }

    @Override
    public void upload(String title) {

        System.out.println("The "+name+"  channel uplaoded "+ title);
       this.notifyUsers(title);
    }

    @Override
    public void notifyUsers(String title) {
         for(Subscriber s:subscribers){
            s.update(title);
        }
       
    }
    
}
