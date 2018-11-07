// Ojhan Ardalan AD2 CISP 401 Fall 2018
// Diamond.java

import java.util.Scanner;
public class Diamond {
	public static void draw() { //method that draws the diamond
		Scanner scan = new Scanner(System.in); //makes scanner class
		while(true) { //loops until a valid input is entered
			System.out.print("Enter number of rows (odd number 1 to 19): "); //asks the user for input
			int x = scan.nextInt(); //sets input to x
			if (x > 0 && x < 20 && x % 2 == 1) { //makes sure x is an odd number between 1-19
				int k = 0; //determines number of * to draw
				
				for(int i = 0; i < (int)Math.round(x/2.0); i++) { //prints the first half of the diamond
					for(int j = x/2; j > i; j--) //prints out the number of spaces before the *'s
						System.out.print(" ");
					
					for(int j = 0; j <= k; j++) //prints out the *'s
						System.out.print("*");
					System.out.println(); //makes a new line
					k += 2;	//adds two more *'s for the next line
				}
				
				k -= 4; //subtracts 4 *'s for the bottom half
						
				for(int i = 0; i < x/2; i++) { //prints the bottom half of the diamond
					for(int j = -1; j < i; j++) //prints out the number of spaces before the *'s
						System.out.print(" ");
					
					for(int j = 0; j <= k; j++) //prints out the *'s
						System.out.print("*");
					System.out.println();
					k -= 2;	//subtracts two *'s for the next line
				}
			break; //breaks out of the loop
			}
				
			else {
				System.out.println("\n** The inputted row number, " + x + ", is not correct. **\n");
				continue; //resets the loop
			}
			
		}
	System.out.println();
	}
}		
		
		
		
		
	

