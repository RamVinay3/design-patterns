package structuralPatterns.compositePattern;

// Interface for items that can be added to the cart
public interface CartItem {
    double getPrice();
    void display(String indent);
}
