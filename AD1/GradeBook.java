// Ojhan Ardalan AD1 CISP 401 Fall 2018
// GradeBook.java
// GradeBook class with a constructor to initialize the course name.

public class GradeBook
{
   private String courseName; // course name for this GradeBook
   private String instructorName;
   // constructor initializes courseName with String supplied as argument
   public GradeBook( String name, String name2 )
   {
      courseName = name; // initializes courseName
      instructorName = name2;
   } // end constructor

   // method to set the course name
   public void setCourseName( String name )
   {
      courseName = name; // store the course name
   } // end method setCourseName
   
   public void setInstructorName(String n){
	   instructorName = n;
   }

   // method to retrieve the course name
   public String getCourseName()
   {
      return courseName;
   } // end method getCourseName
   
   public String getInstructorName() {
	   return instructorName;
   }

   // display a welcome message to the GradeBook user
   public void displayMessage()
   {
      // this statement calls getCourseName to get the 
      // name of the course this GradeBook represents
      System.out.printf( "Welcome to the grade book for\n%s!\n", 
         getCourseName() );
      System.out.println("This course is presented by: " + instructorName);
   } // end method displayMessage

} // end class GradeBook

