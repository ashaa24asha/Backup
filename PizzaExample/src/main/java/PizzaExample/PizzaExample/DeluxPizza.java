package PizzaExample.PizzaExample;

public class DeluxPizza extends Pizza
{

	public DeluxPizza(Boolean veg) {
		super(veg);
		super.addCheese();
		super.addExtraToppings();
	}

	@Override
	public void addExtraToppings() {
		
	}

	@Override
	public void addCheese() {
		
	}
	

}
