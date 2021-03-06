package cn.schema.decorator;

public class Mocha extends CondimentDecorator{

	Beverage beverage;
	public Mocha(Beverage bev){
		this.beverage = bev;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.beverage.getDescription() + "Mocha ";
	}

	@Override
	public Double cost() {
		// TODO Auto-generated method stub
		return 3.11 + this.beverage.cost();
	}

}
