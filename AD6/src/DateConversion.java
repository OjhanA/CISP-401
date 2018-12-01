// Ojhan Ardalan AD6 CISP 401 Fall 2018
// DateConversion.java
import java.util.*; //imports java.util

public class DateConversion {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //makes a Scanner object
		String[] ans = new String[20]; //makes an array for the user input
		String[] formattedDates = new String[20]; //makes an array for the formatted dates
		
		for (int i = 0; i < 20; i++) { //loops 20 times
			
			System.out.println("Please enter a date in mm/dd/yyyy (04/05/2018,4/5/2018, 04/5/2018, or 4/05/2018) format or enter 9999/ to terminate the program.");
			
			ans[i] = scan.nextLine(); //puts the user input into the array
			if (ans[i].equals("9999/")) //if the user enters the sentinel value, the loop breaks
				break;
			
			while (!validate(ans[i])) { //checks to make sure the date is validly formatted 
				System.out.println("Please format the date correctly (mm/dd/yyyy)"); //if not, will ask the user to enter the date correctly
				ans[i] = scan.nextLine();
			}
			
		formattedDates = formatDate(ans[i], formattedDates, i); //calls the formateDate method to format the user inputed dates
		System.out.println();
	
		}
		
		System.out.println("\n" + printResult(ans, formattedDates)); //prints out the user inputs and formatted dates in a table
	}
	
	public static int getMonth(String s) { //a method to get the month
        return Integer.parseInt(s.split("/")[0]); //splits the date by each dash and returns the first element (the month) as an int
	}
	
	public static int getDate(String s) { //a method to get the date
        return Integer.parseInt(s.split("/")[1]); //splits the date by each dash and returns the second element (the date) as an int
	}
	
	public static int getYear(String s) { //a method to get the year
        return Integer.parseInt(s.split("/")[2]); //splits the date by each dash and returns the third element (the year) as an int
	}
	
	public static boolean validate(String s) { //a method to validate if the user inputed a correct date
		s = s.replaceAll("[/]+","/"); //removes any extra "/" the user inputed
        
		if (!s.matches("[0-1]?[0-9][/][0-3]?[0-9][/]\\d+")) //checks to see if the date matches the style mm/dd/yyyy
			return false; //if not returns false
		else if (getMonth(s) == 0 || getMonth(s) > 12) //checks to see if the month is between 1 and 12
			return false;
		else if (getDate(s) == 0 || getDate(s) > 31) //checks to see if the date is between 1 and 31
			return false;
		else
			return true; //if there is no problem, the method returns true
	}
	
	public static String[] formatDate(String s, String[] dates, int index) { //a method to format the dates
		s = s.replaceAll("[/]+","/"); //removes any extra "/" the user inputed

		switch(getMonth(s)) { //a switch case to check which month the user inputed
			case 1:
				dates[index] = "January ";
				break;
			case 2:
				dates[index] = "February ";
				break;
			case 3:
				dates[index] = "March ";
				break;
			case 4:
				dates[index] = "April ";
				break;
			case 5:
				dates[index] = "May ";
				break;
			case 6:
				dates[index] = "June ";
				break;
			case 7:
				dates[index] = "July ";
				break;
			case 8:
				dates[index] = "August ";
				break;
			case 9:
				dates[index] = "September ";
				break;
			case 10:
				dates[index] = "October ";
				break;
			case 11:
				dates[index] = "November ";
				break;
			case 12:
				dates[index] = "December ";
				break;
		}
		
		dates[index] += getDate(s) + ", " + getYear(s); //adds the date and year in addition to the month 
		
		return dates; //returns the array of formated dates
	}
	
	public static String printResult(String[] original, String[] formatted) { //a method that prints the results in a table
		String s = "Display date in  |	 Display date in \nOriginal format  |	  other format \n-----------------|-----------------------\n"; //creates a string that will start the table
		for (int i = 0; i < original.length; i++) { //loops through the array
			if (original[i] != null && !original[i].equals("9999/")) //will only print if not null and not the sentinel value
				s += String.format("  %-14s |\t%s\n", original[i], formatted[i]); //adds the original and formatted dates to the string
		}
		return s; //returns the formatted string
	}
	
}
