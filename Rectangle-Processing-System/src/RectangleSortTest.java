import java.util.List;
import java.util.ArrayList;

public class RectangleSortTest {

	public static void main(String[] args) {
		 List<Rectangle> rectangles = new ArrayList<>();
	        rectangles.add(new Rectangle(6.9, 5.7));
	        rectangles.add(new Rectangle(5.6, 5.1));
	        rectangles.add(new Rectangle(8.0, 4.2));
	        rectangles.add(new Rectangle(7.4, 3.8));
	        rectangles.add(new Rectangle(3.9, 6.2));

	        //Print rectangle’s unsorted area list
	        System.out.println("Unsorted Areas:");
	        for (Rectangle rect : rectangles) {
	        	System.out.println(rect.calculateArea());
	        }
	        
	        //Sort the list by area
	        rectangles.sort(new RectangleComparator());
	        
	        //Print the sorted list
	        System.out.println();
	        System.out.println("Sorted Areas:");
	        for (Rectangle rect : rectangles) {
	        	System.out.println(rect.calculateArea());
	        }
	    }
	}
