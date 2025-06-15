package behavarioualPatterns.observerPattern;

public interface Channel {
    void subscribe(Subscriber subscriber);
    void unSubscribe(Subscriber subscriber);
    void upload(String title);
    
}
