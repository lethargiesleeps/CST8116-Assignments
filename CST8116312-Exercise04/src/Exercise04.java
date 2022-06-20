/*
 * Lab Exercise 04
 * Professor: Mel Sanschagrin
 * Student: Michael Boisvenu-Landry
 * Section: 312
 * Submitted On: 18/03/22
 */

import java.util.Scanner;

//Main execution point of program. Responsible for control flow logic
public class Exercise04 {

	public static void main(String[] args) {
        
		final int VALIDATE_STICK = 1; //Uses class MeterStick's verify() method
		final int PRINT_CENTIMETERS = 2; //Uses class MeterStick's toCentimeters() method
		final int PRINT_MILLIMETERS = 3; //Uses class MeterStick's toMillimeters method
		final int STICK_REPORT = 4; //Uses class MeterStick's toString() method
		
		Scanner scanner = new Scanner(System.in); //For input
		MeterStick stick = new MeterStick();
		
		double length; //User input for length property of class MeterStick
		int option; //Control flow variable
		String output = ""; //Returned message once user makes a menu selection, initialized to prevent crashing1

		System.out.println("Meter stick checker program.");
		System.out.print("Enter measured length in meters: ");
		
		length = scanner.nextDouble();
		scanner.nextLine();
		stick.setLength(length);
		
		//Menu
		System.out.println("Please select from one of the following: "
				+ "\n" + VALIDATE_STICK + ": To validate meter stick"
				+ "\n" + PRINT_CENTIMETERS + ": To show meter stick length in centimeters"
				+ "\n" + PRINT_MILLIMETERS + ": To show meter stick length in millimeters"
				+ "\n" + STICK_REPORT + ": To show meter stick report");
		
		option = scanner.nextInt(); //Input for menu logic
		scanner.close(); //Input stream no longer needed
		
		//Each case calls the corresponding worker methods of class MeterStick
		//to print values to the console.
		switch(option) {
			case VALIDATE_STICK:
				output = stick.verify();
				break;
				
			case PRINT_CENTIMETERS:
				output = String.format("Centimeters: %5.5f", stick.toCentimeters());
				break;
				
			case PRINT_MILLIMETERS:
				output = String.format("Millimeters: %5.5f", stick.toMillimeters());
				break;
				
			case STICK_REPORT:
				System.out.println(stick.toString());
				break;
			
			default:
				output = "Invalid menu option selected. Please try again.";
				break;
		}
		//Print results
		System.out.println(output);
		//End of program
		System.out.println("Program by Michael Boisvenu-Landry"); 
	}
}
