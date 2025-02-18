
public class Power {
	public static int power(int base, int exponent) {
        // Base case: when exponent is 1
        if (exponent == 1) {
            return base;
        } else {
            // Recursive step: base^exponent = base * base^(exponent - 1)
            return base * power(base, exponent - 1);
        }
    }
}
