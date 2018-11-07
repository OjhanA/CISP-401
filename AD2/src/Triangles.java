// Ojhan Ardalan AD2 CISP 401 Fall 2018
// Triangles.java
public class Triangles {
	public static void draw() { //method to draw the triangles
		for (int i = 1; i <= 10; i++) { //prints the first triangle
			for(int j = 1; j <= i; j++) 
				System.out.print("*");
			System.out.println();
		}
		
		System.out.println(); //separates the triangles
		
		for (int i = 10; i >= 1; i--) { //prints the second triangle
			for(int j = 1; j <= i; j++) 
				System.out.print("*");
			System.out.println();
		}
		
		System.out.println(); //separates the triangles
		
		for (int i = 10; i >= 1; i--) { //prints the third triangle
			for(int j = 10; j > i; j--) 
				System.out.print(" ");
			for(int j = 1; j <= i; j++) 
				System.out.print("*");
			System.out.println();
		}
		
		System.out.println(); //separates the triangles
		
		for (int i = 10; i >= 1; i--) { //prints the third triangle
			for(int j = 1; j < i; j++)
				System.out.print(" ");
			for(int j = 10; j >= i; j--) 
				System.out.print("*");
			System.out.println();
		}
	System.out.println();
	}
}
