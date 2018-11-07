// Ojhan Ardalan AD4 CISP 401 Fall 2018
// ComplexBase.java
public class ComplexBase {
	private double real1, imaginary1, real2, imaginary2; //declares the variables
	
	public ComplexBase() { //constructor with no arguments
		real1 = 0;
		imaginary1 = 0;
		real2 = 0;
		imaginary2 = 0;
	}
	
	public ComplexBase(double r1, double i1, double r2, double i2) { //constructor with four arguments
		real1 = r1;
		imaginary1 = i1;
		real2 = r2;
		imaginary2 = i2;	
	}
	
	public double getFirstReal() { //gets the first real number
		return real1;
	}
	
	public double getFirstImaginary() { //gets the first imaginary number
		return imaginary1;
	}
	
	public double getSecondReal() { //gets the second real number
		return real2;
	}
	
	public double getSecondImaginary() { //gets the second imaginary number
		return imaginary2;
	}
	
}
