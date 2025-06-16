package behavarioualPatterns.templatePattern;

public class Main {

    public static void main(){
        NotificationSender notification=new EmailNotification();
        notification.send("ramvinay609@gmail.com", "This is from Co-edu platform. Thanks for joining");
    }
    
}
