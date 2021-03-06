package cn.schema.factory;

public abstract class PizzaStore {
	
	public void orderPizza(String type){
		Pizza pizza = null;
		pizza = this.createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		System.out.println("---Finished Order Pizza---");
	}
	
	//�������� ---Factory method
	protected abstract Pizza createPizza(String type); 
}
