package cn.schema.decorator;

public class HouseBlend extends Beverage{

	public HouseBlend(){
		description = "House Blend ";
	}
	@Override
	public Double cost() {
		// TODO Auto-generated method stub
		return 2.10;
	}

}
