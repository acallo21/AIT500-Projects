
public class RectangleTest {

	public static void main(String[] args) {
			System.out.println("Testing Normal Conditions: ");
			
//Rectangle 1
try {
		Rectangle rect1 = new Rectangle(5.2, 4.7);
			System.out.println("Rectangle 1: Width: " + rect1.getWidth() + ", Height: " + rect1.getHeight());
			System.out.println("Perimeter: " + rect1.calculatePerimeter());
			System.out.println("Area: " + rect1.calculateArea());
} catch(IllegalArgumentException e) {
			System.out.println("Exception occured: " + e.getMessage());
			}
System.out.println();
//Rectangle 2
try {
	Rectangle rect2 = new Rectangle(10.5, 8.1);
		System.out.println("Rectangle 2: Width: " + rect2.getWidth() + ", Height: " + rect2.getHeight());
		System.out.println("Perimeter: " + rect2.calculatePerimeter());
		System.out.println("Area: " + rect2.calculateArea());
} catch(IllegalArgumentException e) {
		System.out.println("Exception occured: " + e.getMessage());
		}
System.out.println();
System.out.println("Test Setter Methods:");

//Test Setter Methods
	Rectangle rect3 = new Rectangle(5.0, 4.0);
	rect3.setWidth(6.0);
		System.out.println("Rectangle 3: Width: " + rect3.getWidth() + ", Height: " + rect3.getHeight());
	rect3.setHeight(7.0);
		System.out.println("Rectangle 3: Width: " + rect3.getWidth() + ", Height: " + rect3.getHeight());
System.out.println();
System.out.println("Testing Error Conditions");
	Rectangle rect4 = new Rectangle(5.0, 4.0);
	try {
	rect4.setWidth(21.0);
	} catch(IllegalArgumentException e) {
		System.out.println("An exception occured in Rectangle 4: " + e.getMessage());
//Rectangle 5
try {
	Rectangle rect5 = new Rectangle(5.6, 22.0);
} catch(IllegalArgumentException e1) {
			System.out.println("An exception occured in Rectangle 5: " + e1.getMessage());
}
//Rectangle 6
try {
	Rectangle rect6 = new Rectangle(40.0, 7.0);
} catch(IllegalArgumentException e1) {
			System.out.println("An exception occured in Rectangle 6: " + e1.getMessage());
}
System.out.println();
System.out.println("Test Constructor");

			System.out.println("Width too Low");
			try {
				Rectangle rect7 = new Rectangle(-1.0, 3.0);
} catch(IllegalArgumentException e1) {
				System.out.println("Expect bad width in Rectangle 7: " + e1.getMessage());
			}
			
			System.out.println("Height too Low");
			try {
				Rectangle rect8 = new Rectangle(1.0, -3.0);
			} catch(IllegalArgumentException e1) {
				System.out.println("Expect bad height in Rectangle 8: " + e1.getMessage());
			}

		}

	}
}

