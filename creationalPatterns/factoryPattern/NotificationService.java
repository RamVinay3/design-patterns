package creationalPatterns.factoryPattern;
//this will deal with object creation(which type of object should be created)
class NotificationFactory{
    public static Notification getNotification(String mode){
        if(mode=="WhatsApp")return new WhatsappNotification();
        else return new TextNotification();

    }
}
//it just knows the logic what needs to do ,which object is doint is none 
//of it's concern.
public class NotificationService {

    public void sendNotification(String mode){
         Notification notification=NotificationFactory.getNotification(mode);
         notification.send();
    }
   
    
}
