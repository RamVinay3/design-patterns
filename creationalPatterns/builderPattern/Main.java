package creationalPatterns.builderPattern;

public class Main {
    public static void main(){
        Burger burger=new Burger.BurgerBuilder("wheat", "non-veg").setCheese(true).build();
        System.out.println(burger.isHasCheese());
    }
}
