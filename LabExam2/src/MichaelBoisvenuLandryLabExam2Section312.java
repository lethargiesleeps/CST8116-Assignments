/*
 * Author Name: Michael Boisvenu-Landry
 * Lab Professor: Mel Sanschagrin
 * Due Date: 04/04/22
 * Description: Starter Code for Lab Exam 2 (22W) Section 312
 */
import java.util.Scanner;


/*
 * This class is responsible for handling the menu interaction
 * that modifies and/or uses the properties and methods
 * of class Cereal.
 * Also the main execution point for the program, within method main
 * where all the above mentioned logic is executed.
 */
public class MichaelBoisvenuLandryLabExam2Section312 {

	public static void main(String[] args) {
		
		//Main menu
		final int EDIT_CEREAL = 1;
		final int PRINT_CEREAL = 2;
		final int EXIT_CEREAL = 3;
		int userSelection; //Used for selection within menu
				
		Scanner scanner = new Scanner(System.in); //Input stream
		Cereal cereal = new Cereal();
		
		//For mutating cereal object
		double carbsPerCup;
		double cupsOfCereal;
		
		
		
		//Loop control variable
		boolean continueLoop = true;
		
		
		//Loop starts
		while(continueLoop) {
			//Menu output
			System.out.println("\nEnter Option: ");
			System.out.println("1 to edit cereal");
			System.out.println("2 to show carbohydrates for the cereal.");
			System.out.println("3 to exit program");
			System.out.println("Program by: Michael Boisvenu-Landry");
			
			//User input
			userSelection = scanner.nextInt();
			
			switch(userSelection) {
				case EDIT_CEREAL:
					
					//Input/output for cereal related variables
					System.out.println("Enter cup(s) of cereal: ");
					cupsOfCereal = scanner.nextDouble();
					System.out.println("Enter carbohydrates (grams) per cup: ");
					carbsPerCup = scanner.nextDouble();
					
					//Edit cereal object
					cereal.setCarbohydratesPerCup(carbsPerCup);
					cereal.setCups(cupsOfCereal);
					break;
					
				case PRINT_CEREAL:
					//Prints total carbs to the console
					System.out.println(String.format("%.2f grams of carbohydrates in the Cereal", cereal.calculateCarbohydates()));
					break;
					
				case EXIT_CEREAL:
					//Breaks out of loop
					continueLoop = false;
					break;
					
				default:
					//Handle invalid input
					System.out.println("Invalid menu input");
			}
			
			
			
		}
		

	}

}
