package behavarioualPatterns.VisitorPattern;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(){
        Visitor invoice=new InvoiceVisitor();
        Item digitalCard=new DigitalCard("Christmans", 23);
        Item giftCard=new GiftCard("DKD8DKDK82", 5000);
        Item physicalCard=new PhysicalProduct("AC", 20);

        List<Item> items=new ArrayList<>();
        items.add(digitalCard);
        items.add(physicalCard);
        items.add(giftCard);

        for(Item x:items){
            x.accept(invoice);
        }
    }
}
