package cn.schema.simplefactory;

public class SimplePizzaFactoryTest {
	
	public static void main(String args[]){
		
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore pizzaStore = new PizzaStore(factory);
		
		System.out.println("------CURRY order------");
		pizzaStore.orderPizza("Cheese");
		
		System.out.println("------COBE order------");
		pizzaStore.orderPizza("Veggie");
		
	}
}
