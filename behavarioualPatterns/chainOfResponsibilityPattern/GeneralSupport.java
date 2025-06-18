package behavarioualPatterns.chainOfResponsibilityPattern;

public class GeneralSupport  extends SupportHandler{

    @Override
    void handleRequest(String request) {
       if(request.equalsIgnoreCase("general")){
        System.out.println("General team will handle teh request");
       }
       else{
        nextHandler.handleRequest(request);
       }
    }


    
}
