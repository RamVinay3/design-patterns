package creationalPatterns.abstractFactoryPattern;

public interface Invoice {
    void generateInvoice();
}

class GSTInvoice implements Invoice{
    @Override
    public void generateInvoice(){
        System.out.println("Gerated Indian invoice. Please download");
    }
}
class USInvoice implements Invoice{
    @Override
    public void generateInvoice(){
        System.out.println("Gerated US invoice. Please download");
    }
}