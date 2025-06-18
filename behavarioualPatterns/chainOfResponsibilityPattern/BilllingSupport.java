package behavarioualPatterns.chainOfResponsibilityPattern;

public class BilllingSupport extends SupportHandler{

    @Override
    void handleRequest(String request) {
       if(request.equalsIgnoreCase("billing")){
        System.out.println("Billing team will handle teh request");
       }
       else{
        nextHandler.handleRequest(request);
       }
    }
}
