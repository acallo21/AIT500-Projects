import java.util.Scanner;

public class EmployeeTest {
	public static void main(String [] args) {
		try (Scanner input = new Scanner (System.in)) {
			System.out.print("Enter employee one's first name: ");
			String firstName = input.nextLine();
			System.out.print("Enter employee one's last name: ");
			String lastName = input.nextLine();
			System.out.print("Enter employee one's monthly salary: ");
			double monthlySalary = input.nextDouble();
			
			Employee employeeOne = new Employee(firstName, lastName, monthlySalary);
			
			input.nextLine();
			
			System.out.print("Enter employee two's first name: ");
			firstName = input.nextLine();
			System.out.print("Enter employee two's last name: ");
			lastName = input.nextLine();
			System.out.print("Enter employee two's monthly salary: ");
			monthlySalary = input.nextDouble();
			
			Employee employeeTwo = new Employee(firstName, lastName, monthlySalary);

			
			//Display Results
			System.out.printf("Employee One's Name: %s, %s%n", employeeOne.getLastName(), employeeOne.getFirstName());
			System.out.printf("Employee One's Yearly Salary: $%.2f%n", employeeOne.getMonthlySalary() * 12);
			System.out.printf("Employee Two's Name: %s, %s%n", employeeTwo.getLastName(), employeeTwo.getFirstName());
			System.out.printf("Employee Two's Yearly Salary: $%.2f%n", employeeTwo.getMonthlySalary() * 12);
		}



	}
}
