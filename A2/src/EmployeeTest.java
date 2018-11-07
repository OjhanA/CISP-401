// Ojhan Ardalan A2 CISP 401 Fall 2018
// EmployeeTest.java

public class EmployeeTest {
	public static void main(String[] args) {
		//creates three employees with different names and salaries
		Employee e1 = new Employee("Bob", "Jones", 2875);
		Employee e2 = new Employee("Susan", "Baker", 3150.75);
		Employee e3 = new Employee("John", "Lin", -5000);

		//prints the employees' names and salaries
		System.out.printf("Employee 1: %s %s; Yearly Salary: %.2f\n", e1.getFirstName(), e1.getLastName(), e1.getSalary() * 12);
		System.out.printf("Employee 2: %s %s; Yearly Salary: %.2f\n", e2.getFirstName(), e2.getLastName(), e2.getSalary() * 12);
		System.out.printf("Employee 3: %s %s; Yearly Salary: %.2f\n\n", e3.getFirstName(), e3.getLastName(), e3.getSalary() * 12);

		System.out.println("Increasing employee salaries by 10%");
		//increases employee salaries by 10%
		e1.setSalary(e1.getSalary() * 1.1);
		e2.setSalary(e2.getSalary() * 1.1);
		e3.setSalary(e3.getSalary() * 1.1);
		
		//prints the employees' names and salaries again
		System.out.printf("Employee 1: %s %s; Yearly Salary: %.2f\n", e1.getFirstName(), e1.getLastName(), e1.getSalary() * 12);
		System.out.printf("Employee 2: %s %s; Yearly Salary: %.2f\n", e2.getFirstName(), e2.getLastName(), e2.getSalary() * 12);
		System.out.printf("Employee 3: %s %s; Yearly Salary: %.2f\n", e3.getFirstName(), e3.getLastName(), e3.getSalary() * 12);
	}
}
