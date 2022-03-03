// You can experiment here, it won’t be checked

public class DifferentDeclarations {
	
	/* *
	 * The main method → Different declarations
	 * Hard | 2 minutes
	 * https://hyperskill.org/learn/step/2508
	 */
	// Select all declarations of the main method when the program can be compiled but
	// cannot be run:
	// a)
	/*
	public static void main(String[] args) { // √
	System.out.println("Hello from main! I'm OK!");
	}
	*/
	// b)
	/*
	public static void main(String args) { // can be compiled -> cannot be run!
	// Error: Main method not found in class Task, please define the main method as:
	//   public static void main(String[] args)
	//or a JavaFX application class must extend javafx.application.Application
	}
	*/
	// c)
	/*
	private static void main(String[] args) { // can be compiled -> cannot be run!
	// Error: Main method not found in class Task, please define the main method as:
	//   public static void main(String[] args)
	//or a JavaFX application class must extend javafx.application.Application
	}
	*/
	// d)
	/*
	public static main(String[] args) { // can not be compiled!
	// java: invalid method declaration; return type required
	}
	*/
	// e)
	/*
	public void main(String[] args) { // can be compiled -> cannot be run!
	// Error: Main method is not static in class Task, please define the main method as:
	//   public static void main(String[] args)
	}
	*/
	
	/*
	public static void main(String[] args) {
	// put your code here
	}
	*/
}
