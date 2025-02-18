
public class CompareArraysTest {

	public static void main(String[] args) {
		// Compare equal arrays
		System.out.println("Compare equal arrays");
		
		int [] a = {1, 2, 3, 4};
		int [] b = {1, 2, 3, 4};
		System.out.println("(a & b) Expect true: " + CompareArrays.compare(a, b));
		
		int [] c = {3, 1, 5, 8, 7};
		int [] d = {3, 1, 5, 8, 7};
		System.out.println("(c & d) Expect true: " + CompareArrays.compare(c, d));
		
		int [] e = {12, 6, 9};
		int [] f = {12, 6, 9};
		System.out.println("(e & f) Expect true: " + CompareArrays.compare(e, f) + "\n");
		
		// Compare arrays with different elements 
		System.out.println("Compare arrays with different elements");

		int [] g = {5, 9, 4, 2};
		int [] h = {3, 6, 7, 8};
		System.out.println("(g & h) Expect false: " + CompareArrays.compare(g, h));

		int [] i = {10, 2, 4, 8};
		int [] j = {3, 6, 7, 5};
		System.out.println("(i & j) Expect false: " + CompareArrays.compare(i, j) + "\n");
		
		//Compare arrays of different size
		System.out.println("Compare arrays of different size");
		
		int [] k = {5, 6, 4};
		int [] l = {5, 6, 4, 8, 2};
		System.out.println("(k & l) Expect false: " + CompareArrays.compare(k, l));
		
		int [] m = {3, 2, 12, 9};
		int [] n = {3, 2};
		System.out.println("(m & n) Expect false: " + CompareArrays.compare(m, n) + "\n");
		
		//Compare arrays with different order of elements
		System.out.println("Compare arrays with different order of elements");
		
		int [] o = {1, 2, 3, 4};
		int [] p = {4, 3, 2, 1};
		System.out.println("(o & p) Expect false: " + CompareArrays.compare(o, p));
		
		int [] q = {5, 6, 7, 8};
		int [] r = {5, 6, 8, 7};
		System.out.println("(q & r) Expect false: " + CompareArrays.compare(q, r));
	}

}