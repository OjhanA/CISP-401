// Ojhan Ardalan AD4 CISP 401 Fall 2018
// ComplexDivision.java
public class ComplexDivision extends ComplexBase {
	double realD, imaginaryD; //declares the variables
	
	public ComplexDivision() { //constructor with no arguments
		realD = 0;
		imaginaryD = 0;
	}
	
	public ComplexDivision(double r1, double i1, double r2, double i2) { //constructor with four arguments that divides the complex numbers
		super(r1, i1, r2, i2);
		realD = ((r1 * r2) + (i1 * i2)) / (Math.pow(r2, 2) + Math.pow(i2, 2));
		imaginaryD = ((i1 * r2) - (r1 * i2)) / (Math.pow(r2, 2) + Math.pow(i2, 2));
	}
	
	public String toString() { //prints the complex numbers in the correct format
		if (getSecondReal() == 0 && getSecondImaginary() == 0) //checks to see if the second real and imaginary numbers are 0
			return String.format("%-32s (%.1f, %.1f) / (%.1f, %.1f) = infinite.", "Copmlex Numbers Division: ", getFirstReal(), getFirstImaginary(), getSecondReal(), getSecondImaginary());
		else
			return String.format("%-32s (%.1f, %.1f) / (%.1f, %.1f) = (%.1f, %.1f)", "Copmlex Numbers Division: ", getFirstReal(), getFirstImaginary(), getSecondReal(), getSecondImaginary(), realD, imaginaryD);
	}
}
