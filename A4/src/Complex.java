// Ojhan Ardalan A4 CISP 401 Fall 2018
// Complex.java
public class Complex {
	private double real, imaginary; //creates variables for the real and imaginary numbers
	
	public Complex() { //constructor with no arguments
		real = 0;
		imaginary = 0;
	}
	
	public Complex(double r, double i) { //constructor with arguments for the real and imaginary numbers
		real = r;
		imaginary = i;
	}
	
	public Complex add(Complex c) { //method that adds the complex numbers
		Complex temp = new Complex(); //creates a temporary set of complex numbers
		temp.real = real + c.real; 
		temp.imaginary = imaginary + c.imaginary;
		return temp; //returns the added numbers
	}
	
	public Complex subtract(Complex c) { //method that subtracts the complex numbers
		Complex temp = new Complex();
		temp.real = real - c.real;
		temp.imaginary = imaginary - c.imaginary;
		return temp; //returns the subtracted numbers
	}
	
	public Complex multiply(Complex c) { //method that multiplies the complex numbers
		Complex temp = new Complex();
		temp.real = (real * c.real) - (imaginary * c.imaginary);
		temp.imaginary = (real * c.imaginary) + (imaginary * c.real);
		return temp; //returns the multiplied numbers
	}
	
	public Complex division(Complex c) { //method that divides the complex numbers
		Complex temp = new Complex();
		temp.real = ((real * c.real) + (imaginary * c.imaginary)) / (Math.pow(c.real, 2) + Math.pow(c.imaginary, 2));
		temp.imaginary = ((imaginary * c.real) - (real * c.imaginary)) / (Math.pow(c.real, 2) + Math.pow(c.imaginary, 2));
		return temp; //returns the divided numbers
	}
	
	public String toString() { //prints out the complex numbers in the correct format
		return String.format("(%.1f, %.1f)", real, imaginary);
	}
	
}
