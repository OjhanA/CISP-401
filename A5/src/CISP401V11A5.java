public class CISP401V11A5 {
	public static void main(String args[]) throws Exception {
		try { //this try block will catch an exception from the CISP401Method
			CISP401Method(); //calls the CISP401Method
		}
		catch(Exception e) { //catches exception e
			System.out.println(e.getMessage() + "\n"); //prints out the exception's message
			e.printStackTrace(); //prints out the exception's stack trace
		}
	}
	
	public static void CISP401Method() throws Exception { //the CISP401Method
		try { //this try block will catch an exception from the CISP401Method2
			CISP401Method2(); //calls the CISP401Method2
		}
		catch(Exception e) { //catches exception e
			throw e; //rethrows the exception
		}
	}
	
	public static void CISP401Method2() throws Exception  { //the CISP401Method2
		throw new Exception("Exception thrown in CISP401Method2"); //throws an exception with a message
		
	}
}
