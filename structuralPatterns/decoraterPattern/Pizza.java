package structuralPatterns.decoraterPattern;


//Component Interface for pizza
public interface Pizza {
    String  getDescription();
    double getPrice();
}


//concrete Components :Base Pizza

class PlainPizza implements Pizza{
    @Override
    public String getDescription(){
       return "This is plain Pizza";
    }
    @Override
    public double getPrice(){
        return 200;
    }
}

class MargheritaPizza implements Pizza{
    @Override
    public String getDescription(){
       return "This is Margaritta pizza ";
    }
    @Override
    public double getPrice(){
        return 400;
    }
}



//now we can have classes which are wrappers of concrete classes
// ============ Concrete Decorator: Adds Extra Cheese ================
class ExtraCheese extends PizzaDecorator {
    public ExtraCheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Extra Cheese";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 40.0;
    }
}

