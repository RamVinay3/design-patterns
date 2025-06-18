package behavarioualPatterns.mediatoorPattern;

public class User {
    private String name;
    private DocumentSessionMediator doc;
    public User(String name,DocumentSessionMediator doc){
        this.doc=doc;
        this.name=name;
    }
    public void receiverChange(String change,User sender){
        System.out.println("noticed the change "+change + " from "+sender.name + " by "+this.name);
    }
    public void makeChange(String change){
        System.out.println(change + "made by "+this.name);
        doc.broadCastChange(change, this);
    }
}
