/*
 * Lab Exam 01
 * Professor: Mel Sanschagrin
 * Student: Michael Boisvenu-Landry
 * Section: 312
 * Submitted On: 14/02/2022
 */
import java.util.*;

//Class containing method main
public class MichaelBoisvenuLandryLabExam1Section312 {
	//Main point of execution
	public static void main(String[] args) {
		
		//Declarations
		Scanner scanner = new Scanner(System.in); //Used for input
		Cereal cereal = new Cereal(); //Instance of Cereal object
		double cups = 0; //For cups of cereal, using double in case user is using fractional cups
		double carbohydratesPerCup = 0; //For grams of carbs, also using double value type
		
		//Prompt and get input for cups
		System.out.println("Enter amount of cups: ");
		cups = scanner.nextDouble();
		scanner.nextLine();
		
		//Prompt and get input for carbohydratesPerCup
		System.out.println("Enter amount of carbohydrates per cup:");
		carbohydratesPerCup = scanner.nextDouble();
		scanner.close(); //Close input stream to prevent accidental input
		
		//Give input values to Cereal object
		cereal.setCups(cups);
		cereal.setCarbohydratesPerCup(carbohydratesPerCup);
		
		//Reciprocate as output to ensure values are correct
		System.out.println("getCups() is: " + cereal.getCups());
		System.out.println("getCarbohydratesPerCup() is: " + cereal.getCarbohyrdatesPerCup());
		
		//Test worker method and get end calculation
		System.out.println("Testing worker method, total carbohydrates is: " 
		+ String.format("%1.4f", cereal.calculateTotalCarbs())); //Formating calculation to nearest 4 decimals
		System.out.println("Program by: Michael Boisvenu-Landry");
		
	}
}
