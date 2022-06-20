/*
 * Lab Exercise 03
 * Professor: Mel Sanschagrin
 * Student: Michael Boisvenu-Landry
 * Section: 312
 * Submitted On: 20/02/22
 * 
 */


//Class is responsible for instantiating objects and 
//being the main point of execution of the program
import java.util.*;
public class Exercise03 {

	public static void main(String[] args) {
		//Declarations
		double adjacent;
		double opposite;
		
		Scanner scanner = new Scanner(System.in);
		//Using parame2terless constructor to test setters and getters
		RightAngleTriangle rightAngleTriangle = new RightAngleTriangle();
		
		System.out.println("Right angle triangle program:");
		//Prompt for length of adjacent side and get input
		System.out.println("Enter adjacent side length:");
		adjacent = scanner.nextDouble();
		scanner.nextLine(); //Move cursor down
		
		//Prompt for length of opposite side and get input
		System.out.println("Enter opposite side length:");
		opposite = scanner.nextDouble();
		scanner.close(); //Scanner object no longer needed
		
		//Set input values to object
		rightAngleTriangle.setAdjacent(adjacent);
		rightAngleTriangle.setOpposite(opposite);
		
		//Print results
		System.out.println(rightAngleTriangle.createReport());
		System.out.println("Program by: Michael Boisvenu-Landry");
		//Program end

	}

}
