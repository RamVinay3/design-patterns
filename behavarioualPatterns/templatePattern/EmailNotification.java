package behavarioualPatterns.templatePattern;

public class EmailNotification extends NotificationSender {
    @Override
    protected  String composeMessage(String formattedMessage){
        return "<html><body><p>"+formattedMessage +"</p></body></html>";

    }
    protected   void sendMessage(String to,String message){
        System.out.println("Sending email to "+to +"having content"+message);
    }
}
