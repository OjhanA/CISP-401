// Ojhan Ardalan AD4 CISP 401 Fall 2018
// ComplexSubtract.java
public class ComplexSubtract extends ComplexBase{
	double realS, imaginaryS; //declares the variables
	
	public ComplexSubtract() { //constructor with no arguments
		realS = 0;
		imaginaryS = 0;
	}
	
	public ComplexSubtract(double r1, double i1, double r2, double i2) { //constructor with four arguments that subtracts the complex numbers
		super(r1, i1, r2, i2);
		realS = r1 - r2;
		imaginaryS = i1 - i2;
	}
	
	public String toString() { //prints the complex numbers in the correct format
		return String.format("%-32s (%.1f, %.1f) - (%.1f, %.1f) = (%.1f, %.1f)", "Complex Numbers Subtraction:", getFirstReal(), getFirstImaginary(), getSecondReal(), getSecondImaginary(), realS, imaginaryS);
	}
}
