package cn.bh.testenum;

public enum SeasonEnum {
	
	SPRING,SUMMER,FALL,WINTER;
	
	public String name;
	public static void main(String args[]){
		
		SeasonEnum se = SeasonEnum.valueOf(SeasonEnum.class, "SPRING");
		se.name = "hello";
		
		System.out.println(se + " : " + se.name);
	}
}
