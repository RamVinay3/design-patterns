package behavarioualPatterns.templatePattern;

public abstract class NotificationSender {
    //final template method
    public final void send(String to ,String rawMessage){
        rateLimitCheck(to);
        validateReceipent(to);
        String formatMessage=formattingMessage(rawMessage);
        preSendLogging(to,formatMessage);

        //logic not common
        String composedMessage=composeMessage(rawMessage);
        sendMessage(to, composedMessage);

        //common
        postSendAnalytics(to);


    }
    //common step1
    private void rateLimitCheck(String to){
        System.out.println("Checking rate limit for "+to);
    }
    //common step2
    private void validateReceipent(String to){
        System.out.println("Validate Receipent "+to);
    }
    //common step3
    private String formattingMessage(String rawMessage){
        return rawMessage.trim();

    }
    //common step 4
    private void preSendLogging(String to ,String message){
        System.out.println("logging before send : "+message +" to : "+to);

    }

    //hooks for abstraction
    protected abstract String composeMessage(String formattedMessage);
    protected abstract  void sendMessage(String to,String message);

    //optional

    protected void postSendAnalytics(String to){
        System.out.println("Analytics updated for "+ to);
    }


}
