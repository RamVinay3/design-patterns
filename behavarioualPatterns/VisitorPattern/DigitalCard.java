package behavarioualPatterns.VisitorPattern;

public class DigitalCard implements Item {
   String name;
   int downloadSizeMB;

    public DigitalCard(String name,int downloadSizeMB){
        this.name=name;
        this.downloadSizeMB=downloadSizeMB;
    }
    @Override
    public void accept(Visitor visitor) {
       visitor.visit(this);
    }
    
}