package behavarioualPatterns.VisitorPattern;

public class InvoiceVisitor implements Visitor{

    @Override
    public void visit(PhysicalProduct item) {
        System.out.println("Invoice "+item.name+" shipping to the customer");
    }

    @Override
    public void visit(GiftCard item) {
       System.out.println("Invoice "+item.code+" - Email with download link");
    }

    @Override
    public void visit(DigitalCard item) {
       System.out.println("Invoice Gift Card code "+ item.name);
    }
    
}
