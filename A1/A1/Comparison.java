// Ojhan Ardalan A1 CISP 401 Fall 2018 
// Fig. 2.15: Comparison.java
// Compare integers using if statements, relational operators 
// and equality operators.
import java.util.Scanner; // program uses class Scanner

public class Comparison {
   // main method begins execution of Java application
   public static void main( String args[] ) {
      // create Scanner to obtain input from command window
      Scanner input = new Scanner( System.in );

      int num1; // first number to compare
      int num2; // second number to compare
      int num3; // third number to compare
      
      
      System.out.print( "Enter first integer: " ); // prompt 
      num1 = input.nextInt(); // read first number from user 

      System.out.print( "Enter second integer: " ); // prompt 
      num2 = input.nextInt(); // read second number from user 

      System.out.print("Enter third integer: ");
      num3 = input.nextInt();
      
      int max = Math.max(num1, Math.max(num2, num3)); //the max of the numbers
      int min = Math.min(num1, Math.min(num2, num3)); //the min of the numbers
      int med = num1 + num2 + num3 - max - min; //the medium of the numbers
      
      System.out.printf("\nFor the numbers %d, %d and %d", num1, num2, num3); //prints the numbers
      
      System.out.println("\nThe largest is: " + max); //prints the largest number
      
      System.out.println("The smallest is: " + min); //prints the smallest number
      
      System.out.println("The median is: " + med); //prints the median
      
      System.out.println("The range is: " + (max - min)); //prints the range
      
      System.out.println("Sum is: " + (num1 + num2 + num3)); //prints the sum

      System.out.println("Product is: " + (num1 * num2 * num3)); //prints the product

      System.out.println("Average is: " + (num1 + num2 + num3)/3); //prints the average
            
      System.out.println("\nQuotient of the largest divided by the smallest is: " + (max/min)); //prints the quotient 
      
      System.out.println("\nRemainder of the largest divided by the smallest is: " + (max%min)); //prints the remainder

      

   } // end method main

} // end class Comparison

/**************************************************************************
 * (C) Copyright 1992-2007 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
