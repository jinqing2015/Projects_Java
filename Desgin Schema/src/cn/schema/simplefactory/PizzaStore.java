package cn.schema.simplefactory;

public class PizzaStore {
	
	SimplePizzaFactory factory;
	
	public PizzaStore(SimplePizzaFactory factory){
		this.factory = factory;
	}
	public void orderPizza(String type){
		Pizza pizza;
		
		pizza = factory.createPizza(type);
		pizza.bake();
		pizza.cut();
		pizza.box();
	}
}
