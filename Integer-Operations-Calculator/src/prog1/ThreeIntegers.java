package prog1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThreeIntegers {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
	   System.out.println("Start.");
	 
	  ThreeIntegers ti = new ThreeIntegers();
	  int number1, number2,number3;
	  
	  number1 = readInteger("Enter first integer: ");
	  number2 = readInteger("Enter second integer: ");
	  number3 = readInteger("Enter third integer: ");

		  
		  ti.sum(number1, number2, number3);
		  ti.average(number1, number2, number3);
		  ti.product(number1, number2, number3);
		  ti.smallest(number1, number2, number3);
		  ti.largest(number1, number2, number3);
	 input.close();
	}
	private static int readInteger(String message) {
		while (true) {
			try {
				System.out.print(message);
				return input.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Error. Please enter an integer.");
				input.nextLine();
			}
		}
	}
	public void sum(int number1, int number2, int number3) {
		int result = number1 + number2 + number3;
		System.out.println("Sum = " + result);
	}

	public void average(int number1, int number2, int number3) {
		int result = (number1 + number2 + number3) / 3;
		System.out.println("Average = " + result);
	}
	
	public void product(int number1, int number2, int number3) {
		int result = (number1 * number2 * number3);
		System.out.println("Product = " + result);
	}
	
	public void smallest(int number1, int number2, int number3) {
		int result = Math.min(number1, number2);
		result = Math.min(result, number3);
		System.out.println("Smallest = " + result);
	}
	
	public void largest(int number1, int number2, int number3) {
		int result = Math.max(number1, number2);
		result = Math.max(result, number3);
		System.out.println("Largest = " + result);
	}	
}
