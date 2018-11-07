// Ojhan Ardalan AD2 CISP 401 Fall 2018
// SideBySideTriangles.java

public class SideBySideTriangles {
	public static void draw() { //method to draw the triangles
		
		for (int i = 1; i <= 10; i++) { //prints ten lines
			
			for(int j = 1; j <= i; j++) //prints the first triangle
				System.out.print("*");
			for(int j = 10; j > i; j--) 
				System.out.print(" ");
			System.out.print("\t");
			
			for(int j = 10; j >= i; j--) //prints the second triangle
				System.out.print("*");
			System.out.print("\t");
				
   		    if (i > 3)	//code to fix a style error 
				System.out.print("\t");
		
			for(int j = 1; j < i; j++) //prints the third triangle
				System.out.print(" ");
			for(int j = 10; j >= i; j--) 
				System.out.print("*");
			System.out.print("\t");
		
			for(int j = 10; j > i; j--) //prints the fourth triangle
				System.out.print(" ");
			for(int j = 1; j <= i; j++) 
				System.out.print("*");
		
		System.out.println(); //goes to the next line
		
		}
	System.out.println();
	}
}

