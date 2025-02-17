import java.util.Comparator;

class RectangleComparator implements Comparator<Rectangle> {
	
	    public int compare(Rectangle r1, Rectangle r2) {
	        double area1 = r1.calculateArea();
	        double area2 = r2.calculateArea();
	        if (area1 < area2) {
	            return -1;
	        } else if (area1 > area2) {
	            return 1;
	        } else {
	            return 0;
	     }
	}
}
