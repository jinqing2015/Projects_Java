package cn.schema.decorator;

public class Whip extends CondimentDecorator{

	Beverage beverage;
	public Whip(Beverage bev){
		this.beverage = bev;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.beverage.getDescription() + "Whip ";
	}

	@Override
	public Double cost() {
		// TODO Auto-generated method stub
		return 2.79 + this.beverage.cost();
	}

}
