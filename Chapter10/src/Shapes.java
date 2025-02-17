
public abstract class Shapes {
	
	//Two Abstract Methods
	abstract double getArea();
	abstract double getPerimeter();
	//One Concrete Method
	String getName() {
		return this.getClass().getSimpleName();
	}
}
	//Circle Class
	class Circle extends Shapes {
		double diameter;
	Circle(double diameter) {
		this.diameter = diameter;
	}
	double getArea() {
		return Math.PI * Math.pow(diameter / 2, 2);
	}
	double getPerimeter() {
		return Math.PI * diameter;
	}
}
	//Square Class
	class Square extends Shapes {
		double side;
	Square(double side) {
		this.side = side;
	}
	double getArea() {
		return side * side;
	}
	double getPerimeter() {
		return 4 * side;
	}
}
	//Triangle Class
	class Triangle extends Shapes {
		double side;
	Triangle(double side) {
		this.side = side;
	}
	double getArea() {
		double s = (3 * side) / 2;
		return Math.sqrt(s * Math.pow((s - side), 2) * (s - side));
	}
	double getPerimeter() {
		return 3 * side;
	}
}