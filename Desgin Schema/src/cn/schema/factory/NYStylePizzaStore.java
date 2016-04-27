package cn.schema.factory;

public class NYStylePizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(String type) {
		
		if(type.equals("Cheese"))
			return new NYStyleCheesePizza();
		
		return null;
	}

}
