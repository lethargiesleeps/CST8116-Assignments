import java.util.*;
public class Program {

	public static void main(String[] args) {

		//Declarations
		Cabbage cabbage = new Cabbage(); //Cabbage object
		double weight;  //Holds weight of cabbage
		double costPerKilogram; //Holds cost per 1 kilogram
		double cabbagePrice; //Price of cabbage based on weight and cost
		
		Scanner scanner = new Scanner(System.in); //For user input
		
		//Getting input for cabbage weight and preventing future input issues
		System.out.println("Enter weight: ");
		weight = scanner.nextDouble(); 
		scanner.nextLine(); 
		
		//Getting input for cost per kg and preventing future input issues
		System.out.println("Enter cost per kilogram: ");
		costPerKilogram = scanner.nextDouble();
		scanner.nextLine();
		scanner.close();
		
		//Testing the Cabbage object setters and getters for comparison
		cabbage.setWeight(weight);
		cabbage.setCostPerKilogram(costPerKilogram);
		weight = cabbage.getWeight();
		costPerKilogram = cabbage.getCostPerKilogram();
		//Testing the worker method
		cabbagePrice = cabbage.calculatePrice();
		
		//Output weight, cost per kg, and price for verification
		System.out.println("cabbage.getWeight() is: " + weight);
		System.out.println("cabbage.costPerKilogram() is: " + costPerKilogram);
		System.out.println("cabbage.getPrice() is: " + cabbagePrice);
		
		//Print report
		System.out.println();//For adding a bit of space to output
		System.out.println("cabbage.printReport():");
		cabbage.printReport();
		
		//Testing overloaded constructor of class Cabbage
		System.out.println();
		System.out.println("Testing overloaded constuctor with anotherCabbage.\n");
		System.out.println("Values: \nWeight = 3.5kg\nCost Per Kg = 2.5");
		System.out.println("\nanotherCabbage.printReport():");
		Cabbage anotherCabbage = new Cabbage(4.2,2.23);
		anotherCabbage.printReport();
		System.out.println("End of program.\nProgram created by: Michael Boisvenu-Landry");
		
		
		
		

	}

}
