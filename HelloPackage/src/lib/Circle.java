package lib;

public class Circle {
	private final double PI = 3.14;
	
	private int radius;
	private String name;
	
	public Circle(Circle c)
	{
		this.radius = c.radius;
		this.name = new String(c.name);
	}
	
	public Circle(int r, String n) {
		this.initialize(r, n);
	}
	
	private void initialize(int r, String n) {
		this.radius = r;
		this.name = n;
	}
	
	public void setRadius (int radius) {
		this.radius = radius;
	}
	
	public int getRadius() {
		return this.radius;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getPI() {
		return this.PI;
	}
	
	public double getArea() {
		return PI * radius * radius;
	}
	
	public String toString() {
		return "name : " +getName() + " radius : " + getRadius();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Class and Object practice");
	
	
		Circle pizza = new Circle(15, "파인애플 피자 ");
		System.out.println(pizza.toString());
		
		Circle pizzaCopy = new Circle(pizza);  // 
		System.out.println(pizzaCopy.toString());
}
}