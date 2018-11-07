// CISP 401 Fall 2018 Ojhan Ardalan
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
      int num3;
      
      
      System.out.print( "Enter first integer: " ); // prompt 
      num1 = input.nextInt(); // read first number from user 

      System.out.print( "Enter second integer: " ); // prompt 
      num2 = input.nextInt(); // read second number from user 

      System.out.print("Enter third integer: ");
      num3 = input.nextInt();
      
      int max = Math.max(num1, Math.max(num2, num3));
      int min = Math.min(num1, Math.min(num2, num3));
      int med = num1 + num2 + num3 - max - min;
      
      System.out.printf("\nFor the numbers %d, %d and %d", num1, num2, num3);
      
      System.out.println("\nThe largest is: " + max);
      
      System.out.println("The smallest is: " + min);
      
      System.out.println("The median is: " + med);
      
      System.out.println("The range is: " + (max - min));
      
      System.out.println("Sum is: " + (num1 + num2 + num3));

      System.out.println("Product is: " + (num1 * num2 * num3));

      System.out.println("Average is: " + (num1 + num2 + num3)/3);
            
      System.out.println("\nQuotient of the largest divided by the smallest is: " + (max/min));
      
      System.out.println("\nRemainder of the largest divided by the smallest is: " + (max%min));

      

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
