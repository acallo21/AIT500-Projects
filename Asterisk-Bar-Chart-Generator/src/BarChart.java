
public class BarChart {
	private int numberOfstars;
	
	public BarChart(int numberOfstars) {
		this.numberOfstars = numberOfstars;
	}
	
	public void displayBar() {
		//loop this numberOfstars times and execute the following
		//line of code within the loop
		//Counter loop here
	for (int i = 0; i<this.numberOfstars; i++)		
		System.out.print("*");

		//after the loop
		System.out.println();
	}
}
