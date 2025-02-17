
public class TestShapes {

	public static void main(String[] args) {
		Shapes[] shapes = new Shapes[3];
		shapes[0] = new Circle(5.3);
		shapes[1] = new Square(6.9);
		shapes[2] = new Triangle(8.1);
		
		for (Shapes shape : shapes) {
			System.out.println("Shape: " + shape.getName());
			System.out.println("Area: " + shape.getArea());
			System.out.println("Perimeter: " + shape.getPerimeter());
			System.out.println();
		}
	}
}
