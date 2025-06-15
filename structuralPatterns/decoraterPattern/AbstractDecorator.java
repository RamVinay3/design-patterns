
package structuralPatterns.decoraterPattern;
//abstract decorator class
/// ====== Implements Pizza and holds a reference to a Pizza object =======
abstract class PizzaDecorator implements Pizza{

    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza){
        this.pizza=pizza;
    }

}

/* In  above if you see ,we are passing a Pizza object to constructor  and there is no default constructor
   The classes which i am calling extending through these pizzaDecorator must pass a BasePizza 
   even if you put new Cheese(new Cheese()) - the inner class will expect a base class and it never ends until we
   uses the base class otherwise it throws error.


*/ 

/* 
 *  Pizza myPizza = new MargheritaPizza();
 *  myPizza = new ExtraCheese(myPizza); 
 * Okay
 * 
 */

 /*
  * Pizza myPizza =new ExtraCheese(new ExtraCheese(); );//gives compile error as it expects passing pizza in it's constructor. 
  */


       
       
        