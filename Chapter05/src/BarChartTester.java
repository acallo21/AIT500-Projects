import java.util.Scanner;

public class BarChartTester {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//Loop 5 times asking for the number of stars, and create a BarChart object
		for (int i = 0; i < 5; i++) {
		System.out.print("Enter a number: ");
		int numberOfStars = input.nextInt();
		BarChart barChart = new BarChart(numberOfStars);
		barChart.displayBar();
	}
	}
	
}
