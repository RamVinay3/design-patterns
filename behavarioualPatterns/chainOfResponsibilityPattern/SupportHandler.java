package behavarioualPatterns.chainOfResponsibilityPattern;

public abstract class SupportHandler {
    protected SupportHandler nextHandler;
    abstract void handleRequest(String request);
    public void setHandler(SupportHandler handler){
        this.nextHandler=handler;
    }
}


