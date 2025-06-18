package behavarioualPatterns.VisitorPattern;

//this will have methods  for each concrete class.
public interface  Visitor {
    void visit(PhysicalProduct item);
    void visit(GiftCard item);
    void visit(DigitalCard item);
}
//each feature will implement visitor so if we add a element we 
//need to touch every feature. -difficult in this case.