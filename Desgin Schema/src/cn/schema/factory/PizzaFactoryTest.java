package cn.schema.factory;

public class PizzaFactoryTest {
	
	public static void main(String args[]){
		
		System.out.println("--- In NY ,COBE order a cheese pizza");
		PizzaStore nyStore = new NYStylePizzaStore();
		nyStore.orderPizza("Cheese");
		
		System.out.println("--- In Chicago ,Curry order a cheese pizza");
		PizzaStore cStore = new ChicagoStylePizzaStore();
		cStore.orderPizza("Cheese");
	}
}
