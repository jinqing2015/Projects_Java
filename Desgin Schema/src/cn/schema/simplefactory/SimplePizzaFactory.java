package cn.schema.simplefactory;

public class SimplePizzaFactory {
	
	public Pizza createPizza(String type){
		
		if(type == "Cheese")
			return new CheesePizza();
		if(type == "Veggie")
			return new VeggiePizza();
		
		return null;
		
	}
}