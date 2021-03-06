package cn.schema.decorator;

public class DecoratorTest {

	public static void main(String args[]){
		
		
		System.out.println("------DecoratorTest------ ");
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription());
		System.out.println(beverage.cost());
		
		System.out.println("------DecoratorTest------ ");
		Beverage beverage2 = new Espresso();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription());
		System.out.println(beverage2.cost());
	}
	
}
