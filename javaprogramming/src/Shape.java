
public class Shape {
	protected int x,y;
	public void draw() {
	System.out.println("Shape Draw");
	}
}


class Rectangle extends Shape {
	private int width, height;
	public void draw() {
	System.out.println("Rectangle Draw");
	}
}

class Triangle extends Shape {
	private int base, height;
	public void draw() {
	System.out.println("Triagnle Draw");
	}
}

class Circle extends Shape {
	private int radius;
	
	public void draw() {
	System.out.println("Circle Draw");
	}
}