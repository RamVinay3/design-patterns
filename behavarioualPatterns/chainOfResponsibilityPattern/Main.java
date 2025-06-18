package behavarioualPatterns.chainOfResponsibilityPattern;

public class Main {

    public static void main(){
        SupportHandler general=new GeneralSupport();
        SupportHandler billing=new BilllingSupport();
        SupportHandler technical=new TechnicalSupport();
        SupportHandler delivery=new DeliverySupport();

        general.setHandler(billing);
        billing.setHandler(technical);
        technical.setHandler(delivery);

        general.handleRequest("delivery");

    }
    
}
