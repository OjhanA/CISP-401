// Ojhan Ardalan AD2 CISP 401 Fall 2018
// ShapesTest.java

//importing for the GUI
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShapesTest {
	public static void main(String[] args) {
		int choice = 0;
		do { //loops the program until the user quits
			//asks the user for input
			String input = JOptionPane.showInputDialog("Draw Triangles and Diamond shapes\n"
					+ "Enter 1 to draw four seperate triangles \nEnter 2 to draw four triangles in the same row\n"
					+ "Enter 3 to draw a diamond \nEnter 4 to exit the program");
			
			try { //makes sure the input is an int
				choice = Integer.parseInt(input); //converts the input to an int
			}
			catch(Exception e){ //makes sure the program does not crash if the user picks an invalid value
				System.out.println("Invalid value entered"); //tells the user they picked an invalid value
				continue; //resets the loop
			}
				
			switch (choice) {
				case 1:  //draws the triangles
					Triangles.draw();
					break;
				
				case 2: //draws the side by side triangles
					SideBySideTriangles.draw();
					break;
				
				case 3: //draws the diamond
					Diamond.draw();
					break;
				
				case 4:  //prints if the user quits the program
					System.out.println("Thank you for using this program");
					break;
				
				default: //in case the user picks a number not between 1 and 4
					System.out.println("Pick a number between 1 and 4");
					break;
			}
	
		} while(choice != 4); //the user quits the program
	}
}