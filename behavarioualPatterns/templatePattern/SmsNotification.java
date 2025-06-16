package behavarioualPatterns.templatePattern;

public class SmsNotification extends NotificationSender {
     @Override
    protected  String composeMessage(String formattedMessage){
        return "[SMS]"+formattedMessage +".";

    }
    @Override
    protected   void sendMessage(String to,String message){
        System.out.println("Sending email to "+to +"having content"+message);
    }
    //over-riding optional hook
    @Override
    protected void postSendAnalytics(String to){

        System.out.println("Custom SMS analytics for: "+to);

    }
}
