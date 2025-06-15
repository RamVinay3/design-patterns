package behavarioualPatterns.observerPattern;

public class Main {
    public static void main(){
        Channel takeYouForward=new YoutubeChannel("TUF plus");
        takeYouForward.subscribe(new EmailSubscribers("ramvinay"));
        takeYouForward.subscribe(new MobileAppSubscribers("rupali"));

        takeYouForward.upload("DFS Algorithm");
        

    }
    
}
