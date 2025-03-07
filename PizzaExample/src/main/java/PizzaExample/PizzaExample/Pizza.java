package PizzaExample.PizzaExample;

public class Pizza {
	
	private int price;
	private boolean veg;
	private int toppingsPrice = 100;
	private int extraCheesePrice = 150;
	private int takeAwayPrice = 20;
	private int basePizzaPrice;
	private boolean isExtraToppingsAdded = false;
	private boolean isExtraCheeseAdded = false;
	private boolean isTakeAwayAdded = false;
	
	public Pizza(Boolean veg)
	{
		if(veg == true)
		{
			this.price = 300;
		}
		else
		{
			this.price = 400;
		}
		basePizzaPrice = this.price;
	}
	
	public void getPizzaPrice()
	{
		System.out.println(this.price);
	}
	
	public void addExtraToppings()
	{
		isExtraToppingsAdded = true;
		this.price = this.price + toppingsPrice;
	}
	
	public void addCheese()
	{
		isExtraCheeseAdded = true;
		this.price = this.price + extraCheesePrice;
	}
	public void takeAway()
	{
		isTakeAwayAdded = true;
		this.price = this.price + takeAwayPrice;
	}
	
	public void bill()
	{
		System.out.println("Pizza price is: "+basePizzaPrice);
		String bill = "";
		if(isExtraToppingsAdded)
		{
			bill = bill + "\nExtra Toppings added price: "+ toppingsPrice +"\n";
		}
		if(isExtraCheeseAdded)
		{
			bill = bill + "Extra Cheese added price: "+ extraCheesePrice +"\n";
		}
		if(isTakeAwayAdded)
		{
			bill = bill + "Extra TakeAway added price: "+ takeAwayPrice +"\n";
		}
		bill = bill + "Bill: " + this.price + "\n";
		System.out.println(bill);
	}
	

}
