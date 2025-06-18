package behavarioualPatterns.chainOfResponsibilityPattern;

public class DeliverySupport extends SupportHandler{

   @Override
    void handleRequest(String request) {
       if(request.equalsIgnoreCase("delivery")){
        System.out.println("Delivery team will handle the request");
       }
       else{
        System.out.println("could. not handle ther request.please try after some time.");
       }
    }

    
}
