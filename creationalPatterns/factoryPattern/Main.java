package creationalPatterns.factoryPattern;

public class Main {

    public static void main(String[] args){
        NotificationService notificationService=new NotificationService();
        notificationService.sendNotification("WhatsApp");
        notificationService.sendNotification("Text");

    }
    
}
