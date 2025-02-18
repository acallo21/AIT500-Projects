import java.util.Scanner;

public class GasMileage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int miles = 1;
		int gallons = 1;
		int MPG = 1;
		
		while (miles != -1) {
		System.out.print("Enter miles driven (-1 to end): ");
		miles = input.nextInt();
			if (miles == -1) {
			input.close();
			System.out.print("Application finished. ");
			System.exit(1);
			
			} else
		System.out.print("Enter gallons used: ");
		gallons = input.nextInt();
			if (gallons == 0) {
				System.out.println("*Error: Total gallons used cannot be zero*");
				System.out.print("Enter gallons used: ");
				gallons = input.nextInt();
				}

		MPG = miles/gallons;
		System.out.println("  Your MPG total is: "+MPG);
		}
		}
	
	}