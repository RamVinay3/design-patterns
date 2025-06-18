package behavarioualPatterns.chainOfResponsibilityPattern;

public class TechnicalSupport extends SupportHandler{

   @Override
    void handleRequest(String request) {
       if(request.equalsIgnoreCase("technical")){
        System.out.println("Technical team will handle teh request");
       }
       else{
        nextHandler.handleRequest(request);
       }
    }

   
}
