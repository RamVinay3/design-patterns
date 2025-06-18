package behavarioualPatterns.VisitorPattern;

public class PhysicalProduct implements Item {
     String name;
     double weight;
     
    public PhysicalProduct(String name,double weight){
        this.name=name;
        this.weight=weight;
    }
    @Override
    public void accept(Visitor visitor) {
       visitor.visit(this);
    }
    
}