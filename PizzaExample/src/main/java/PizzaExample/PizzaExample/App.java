package PizzaExample.PizzaExample;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome" );
//        Pizza basePizza = new Pizza(true);
//        basePizza.addCheese();
//        basePizza.addExtraToppings();
//        basePizza.takeAway();
//        basePizza.bill();
        
        DeluxPizza dp = new DeluxPizza(true);
        dp.addCheese();
        dp.addExtraToppings();
        dp.takeAway();
        dp.bill();
        
    }
}
