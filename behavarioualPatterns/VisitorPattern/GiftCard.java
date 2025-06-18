package behavarioualPatterns.VisitorPattern;

public class GiftCard implements Item {
    String code;
    double amount;
    

    public GiftCard(String code,double amount){
        this.code=code;
        this.amount=amount;
    }

    @Override
    public void accept(Visitor visitor) {
       visitor.visit(this);
    }
    
}
