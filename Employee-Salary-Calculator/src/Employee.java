
public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;
    
    public Employee(String firstName, String lastName, double monthlySalary) {
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.monthlySalary = monthlySalary;
    	
    	if (monthlySalary < 0.0) {
			this.monthlySalary = 0.0;
			}
    }
    
    public String getFirstName () {
    	return firstName;
    }
    public String getLastName () {
    	return lastName;
    }
    public double getMonthlySalary () {
    	return monthlySalary;

    }
    
}
