class Shape
{
	public double calculateArea()
	{
		return 0;
	}
}

class Rectangle extends Shape
{
	private double length, width;
	Rectangle(double l, double w)
	{
		length = l;
		width = w;
	}
	public double calculateArea()
	{
		return length*width;
	}
}

class Triangle extends Shape
{
	private double base, height;
	Triangle(double b, double h)
	{
		base = b;
		height = h;
	}
	public double calculateArea()
	{
		return 0.5*base*height;
	}
}

public class AreaOfShapes
{
	public static void main(String[] args)
	{

		Shape s = new Shape();
		System.out.println("Area of Shape class is "+s.calculateArea() );
		
		Rectangle r = new Rectangle(10,20);
		System.out.println("Area of Rectangle class is "+r.calculateArea());
		
		Triangle t = new Triangle(50,22.6);
		System.out.println("Area of triangle class is "+t.calculateArea());
		
	}
}
