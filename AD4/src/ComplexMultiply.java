// Ojhan Ardalan AD4 CISP 401 Fall 2018
// ComplexMultiply.java
public class ComplexMultiply extends ComplexBase {
	double realM, imaginaryM; //declares the variables
	
	public ComplexMultiply() { //constructor with no arguments
		realM = 0;
		imaginaryM = 0;
	}
	
	public ComplexMultiply(double r1, double i1, double r2, double i2) { //constructor with four arguments that multiplies the complex numbers
		super(r1, i1, r2, i2);
		realM = (r1 * r2) - (i1 * i2);
		imaginaryM = (r1 * i2) + (i1 * r2);
	}
	
	public String toString() { //prints the complex numbers in the correct format
		return String.format("%-32s (%.1f, %.1f) * (%.1f, %.1f) = (%.1f, %.1f)", "Complex Numbers Multiplication:", getFirstReal(), getFirstImaginary(), getSecondReal(), getSecondImaginary(), realM, imaginaryM);
	}
}
