//WAP to calculate the area and perimeter of Rectangle and Circle

class Rectangle
{
	int length, width;
	void areaOfRectangle()
	{
		int area=length*width;
		System.out.println("Area of a rectangle= "+area);
	}
	void perimeterOfRectangle()
	{
		int perimeter=2*(length+width);
		System.out.println("Perimeter of a rectangle= "+perimeter);
	}
}
class Circle
{
	int radius;
	void areaOfCircle()
	{
		double area=3.14*radius*radius;
		System.out.println("Area of a circle= "+area);
	}
	void perimeterOfCircle()
	{
		double perimeter=2*3.14*radius;
		System.out.println("Perimeter of a circle= "+perimeter);
	}
}
public class Shapes{
	public static void main(String args[])
	{
		Rectangle r= new Rectangle();
		r.length=10;
		r.width=15;
		r.areaOfRectangle();
		r.perimeterOfRectangle();

		Circle c=new Circle();
		c.radius=30;
		c.areaOfCircle();
		c.perimeterOfCircle();
	}
}

		
