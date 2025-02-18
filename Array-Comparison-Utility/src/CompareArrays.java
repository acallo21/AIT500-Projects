
public class CompareArrays {
	// This method compares two arrays to determine if they are equal.
    // If they are, then it returns true. Otherwise it returns false.
	public static boolean compare(int [] array1, int [] array2) {
		// initialized so the code compiles
		boolean areEqual = false;
		if (array1.length == array2.length) {
		    for (int i = 0; i < array1.length; i ++) {
		        if (array1 [ i ] != array2 [ i ] ) {
		            return false; 
		        }
		    }
		    return true;
		}
		return areEqual;
	}
}
