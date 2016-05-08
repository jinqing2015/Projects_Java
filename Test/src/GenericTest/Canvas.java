package GenericTest;

import java.util.ArrayList;
import java.util.List;

public class Canvas {

	public void drawAll(List<? extends Shape> shapes)
	{
		for(Shape s : shapes)
		{
			s.draw();
		}
	}
	
	//Test
	public static void main(String args[])
	{
		List<Shape> shapes = new ArrayList<>();
		
		shapes.add(new Circle());
		shapes.add(new Rectange());
		shapes.add(new Circle());
		
		Canvas c = new Canvas();
		c.drawAll(shapes);	
	}	
}
