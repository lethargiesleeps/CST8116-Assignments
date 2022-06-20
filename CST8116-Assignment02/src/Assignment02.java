/*
 * Student Name: Michael Boisvenu-Landry
 * Lab Professor: Mel Sanschagrin
 * Due Date: 25/03/22
 * Description: Assignment 02
 */

/*
 * This class contains the main point of execution for the program.
 * It is not meant to be instantiated in other classes.
 */
public class Assignment02 {

	/**
	 * This programs method main
	 * Instantiates all needed classes and runs a loop continously until the required user input
	 * to terminate is received by class Scanner
	 */
	public static void main(String[] args) {

		/**
		 * These instances are fine being instantiated only once,
		 * as they do not have properties that need to be modified with each
		 * iteration of the loop.
		 */
		LumberChecker lumberChecker = new LumberChecker();
		User user = new User();
		Boolean continueLoop = true; //Used for breaking out of this loop if necessary
		DimensionalLumber dimensionalLumber = new DimensionalLumber();

		do{
			
			double length;
			double thickness;
			double width;
			String userInput;
			
	
			System.out.println("Enter dimensions for the 2x4x8 lumber as measured in inches.");

			//Formats the value of DimensionalLumber's constant fields to print to screen
			System.out.println(String.format("Expected values for dimensions in inches are:\n%f for length, %f for thickness, %f for width.",
			DimensionalLumber.EXPECTED_LENGTH, 
			DimensionalLumber.EXPECTED_THICKNESS, 
			DimensionalLumber.EXPECTED_WIDTH));
	
			//The User class handles all the required input handling
			length = user.inputDouble("Enter measured length: ");
			thickness = user.inputDouble("Enter measured thickness: ");
			width = user.inputDouble("Enter width: ");
	
			//Sets the dimensions into the instance of DimensionalLumber
			dimensionalLumber.setLength(length);
			dimensionalLumber.setThickness(thickness);
			dimensionalLumber.setWidth(width);
	
			//Reports input dimensions
			System.out.println(dimensionalLumber.toString());

			//Handles the lumber validation
			System.out.println(lumberChecker.validate(dimensionalLumber));

			userInput = user.inputString("Continue program? (yes/no)").toLowerCase();
			//This if/else block compares an input string that is then converted to lower case,
			//to account for case variat input,
			// and sees if it matches "yes" or "no"
			if(userInput.equals("yes")){
				//Used instead of 'continue;' for readability
				continueLoop = true;
			}
			else if(userInput.equals("no")){
				continueLoop = false; //Break
			}
			else {
				//input is not 'yes' or 'no'
				System.out.println("Invalid input. Please try again.");
				continueLoop = true;
			}
		}while(continueLoop);
		
		System.out.println("Program by: Michael Boisvenu-Landry");

	}
}