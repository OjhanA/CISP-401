// Ojhan Ardalan A4 CISP 401 Fall 2018
// ComplexTest.java
public class ComplexTest {
	public static void main(String[] args) {
		Complex a = new Complex(9.5, 7.7); //creates a set of complex numbers
		Complex b = new Complex(1.2, 3.1); //creates another set of complex numbers
		System.out.println("A complex number in the form (x,y) is equal to x + yi, where i is the square root of -1.\n");
		System.out.println("*-Complex numbers calculations-*");
		
		System.out.printf("a = %s \nb = %s \na + b = %s \na - b = %s \na * b = %s \na / b = %s \n", a.toString(), b.toString(), a.add(b).toString(), 
						   a.subtract(b).toString(),a.multiply(b).toString(), a.division( b ).toString()); //prints out the complex numbers with all the operations done to them
		
		
	}
}
