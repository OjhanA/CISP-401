// Ojhan Ardalan A2 CISP 401 Fall 2018
// Employee.java

public class Employee {
		String firstName; //creates a variable for the first name
		String lastName; //variable for the last name
		double salary; //variable for the salary
		
		public Employee(String f, String l, double s) { //constructor for employee
			firstName = f;
			lastName = l;
			if (s >= 0) //if salary is negative, sets it to 1000
				salary = s; 
			else { 
				System.out.printf("***The inputted salary: %.2f for %s %s is less than zero. \nSet the salary to $1,000.00.***\n\n", s, firstName, lastName);
				salary = 1000;
			}
		}
		
		public String getFirstName() { //gets the first name
			return firstName;
		}
		
		public String getLastName() { //gets the last name
			return lastName;
		}
		
		public double getSalary() { //gets the salary
			return salary;
		}
		
		public void setFirstName(String s) { //sets the first name
			firstName = s; 
		}
		
		public void setLastName(String s) { //sets the last name
			lastName = s; 
		}
		
		public void setSalary(double s) {  //sets the salary
			if (s >= 0)
				salary = s; 
			else { //sets salary to 1000 if the input is negative
				System.out.printf("***The inputted salary: $%f for %s %s is less than zero. \nSet the salary to $1,000.00.***", s, firstName, lastName);
				salary = 1000;
			}
		}
	}


