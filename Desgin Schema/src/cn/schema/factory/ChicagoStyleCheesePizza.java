package cn.schema.factory;

public class ChicagoStyleCheesePizza extends Pizza{
	
	public ChicagoStyleCheesePizza(){
		
		name = "Chicage Style Pizza";
		dough = "Chicage Style dough";
		sauce = "Chicage Style sauce";
		
		tops.add("444 555 666");
	}
	public void cut(){
		System.out.println("Chicage Style Cut cut cut");
	}
}