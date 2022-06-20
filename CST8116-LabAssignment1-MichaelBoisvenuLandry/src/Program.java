import java.util.*;
/*
 * Lab Assignment 01
 * Professor: Mel Sanschagrin
 * Student: Michael Boisvenu-Landry
 * Section: 312
 * Submitted On: 11/02/22
 * 
 */
//Main execution point of program
public class Program {
	
	public static void main(String[] args) {
		//Variable declaration
		double tableArea = 0; //Area of table in square inches
		double tablesCovered = 0; //Amount of tables that can be varnished with one can
		double diameter = 0;
		int coatsOfVarnish = 0;
		
		//Object declarations
		Scanner scanner = new Scanner(System.in);
		Table table = new Table(); //Using default constructor
		
		System.out.println("This program calculates how tables can be covered"
				+ "\nby a can of varnish.");
		System.out.println("==========");
		
		//Prompt and ask for diameter input
		System.out.println("Enter the diameter of the table:");
		diameter = scanner.nextDouble();
		scanner.nextLine();
		
		//Prompt and ask for coats of varnish input
		System.out.println("Enter coats of varnish needed:");
		coatsOfVarnish = scanner.nextInt();
		scanner.close(); //Input no longer needed beyond this point
		
		//Set values to Table object
		table.setDiameter(diameter);
		table.setCoatsOfVarnish(coatsOfVarnish);
		
		//Ensure properties were properly set
		System.out.println(table.printReport());
		
		//Perform calculations using VarnishCalculator class's static methods
		//Give calculation result to variables within this method's scope
		tableArea = VarnishCalculator.calculateTableArea(table.getDiameter());
		tablesCovered = VarnishCalculator.calculateTablesAmount(table.getDiameter(),table.getCoatsOfVarnish());
		
		//Print results, format values of doubles to the nearest 5 decimal points
		System.out.println("With a table area of: " + String.format("%8.5f", tableArea) + " square inches"
						   +"\nOne can of varnish will cover: " + String.format("%8.5f", tablesCovered) + " tables");
		
		//End of program
		System.out.println("Program by: Michael Boisvenu-Landry");
		
	}
}
