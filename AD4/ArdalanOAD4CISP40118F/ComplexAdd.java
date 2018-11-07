// Ojhan Ardalan AD4 CISP 401 Fall 2018
// ComplexAdd.java
public class ComplexAdd extends ComplexBase{
	double realA, imaginaryA; //declares the variables
	
	public ComplexAdd() { //constructor with no arguments
		realA = 0;
		imaginaryA = 0;
	}
	
	public ComplexAdd(double r1, double i1, double r2, double i2) { //constructor with four arguments that adds the complex numbers
		super(r1, i1, r2, i2);
		realA = r1 + r2;
		imaginaryA = i1 + i2;
	}
	
	public String toString() { //prints the complex numbers in the correct format
		return String.format("%-32s (%.1f, %.1f) + (%.1f, %.1f) = (%.1f, %.1f)", "Complex Numbers Addition:", getFirstReal(), getFirstImaginary(), getSecondReal(), getSecondImaginary(), realA, imaginaryA);
	}
}
