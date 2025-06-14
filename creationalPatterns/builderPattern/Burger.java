package creationalPatterns.builderPattern;

public class Burger {

    //required parameters - everything is final
    private   final String bunType;
    private final String patty;


    //optional parameters- everything is final also
    private final String side;
    private final boolean hasCheese;
    private final boolean hasSause;

    //it is very difficult to write constructor having all these optional parameters combinations
    //so we did come up with builder , we will define same parameters either in inner class(preffered) or stand alone class
    //and write constructor with required parameters and setters for optional parameters.

    public  static class BurgerBuilder{

     //required parameters --here final is intialised where as for optional not 
    private final String bunType;
    private final String patty;


    //optional parameters
    private  String side;
    private  boolean hasCheese;
    private  boolean hasSause;

    public BurgerBuilder(String bunType,String patty){
        this.bunType=bunType;
        this.patty=patty;
    }
    public BurgerBuilder setCheese(boolean cheese){
        this.hasCheese=cheese;

        return this;
    }
    public BurgerBuilder setSauce(boolean cheese){
        this.hasSause=cheese;

        return this;
    }
    public BurgerBuilder setSide(String side){
        this.side=side;

        return this;
    }
    public Burger build(){
        return new Burger(this);
    }

    }

    //getters
    public String getBunType() {
        return bunType;
    }
    public String getPatty() {
        return patty;
    }
    public String getSide() {
        return side;
    }
    public boolean isHasCheese() {
        return hasCheese;
    }
    public boolean isHasSause() {
        return hasSause;
    }
    //cleaner code no need of lengthy list of parameters.
    public Burger(BurgerBuilder builder){
        this.bunType=builder.bunType;
        this.hasCheese=builder.hasCheese;
        this.hasSause=builder.hasSause;
        this.patty=builder.patty;
        this.side=builder.side;
    }
    
}
