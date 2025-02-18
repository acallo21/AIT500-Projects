
public class Rectangle {
	
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		if (width > 0.0 & width <= 20.0) {
			this.width = width;
		} else {
			throw new IllegalArgumentException("width is out of range");
		}
		if (height > 0.0 & height <= 20.0) {
			this.height = height;
		} else {
			throw new IllegalArgumentException("height is out of range");
		}
	}
		// finish the constructor
	double getWidth() {
	        return width;
	}
	double getHeight() {
			return height;
	}
	
	void setWidth(double width) {
		if (width <= 0.0 || width > 20.0) {
			throw new IllegalArgumentException("Width must be greater than 0 and less than or equal to 20");
		}
	this.width = width;
	}
	
	void setHeight(double height) {
		if (height <= 0.0 || height > 20.0) {
			throw new IllegalArgumentException("Height must be greater than 0 and less than or equal to 20");
		}
	this.height = height;
	}

	double calculateArea() {
		return width * height;
	}
	double calculatePerimeter( ) {
		return 2 * (width + height);
	}
}
