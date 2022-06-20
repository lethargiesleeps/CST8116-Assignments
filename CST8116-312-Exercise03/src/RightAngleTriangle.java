/*
 * Lab Exercise 03
 * Professor: Mel Sanschagrin
 * Student: Michael Boisvenu-Landry
 * Section: 312
 * Submitted On: 20/02/22
 * 
 */

//This class is responsible for housing the values of the properties needed in
//a right angle triangle, and the calculations for the hypotenuse, area, and perimeter.
public class RightAngleTriangle {
	//Fields/Properties
	private double adjacent;
	private double opposite;
	
	//Parameterless/Default constructor
	public RightAngleTriangle() {
		
	}
	
	//Overloaded constructor
	public RightAngleTriangle(double adjacent, double opposite) {
		this.adjacent = adjacent;
		this.opposite = opposite;
	}
	
	//Getters (accessors)
	public double getAdjacent() {
		return adjacent;
	}
	public double getOpposite() {
		return opposite;
	}
	//Setters(mutators)
	public void setAdjacent(double adjacent) {
		this.adjacent = adjacent;
	}
	public void setOpposite(double opposite) {
		this.opposite = opposite;
	}
	
	//Worked methods
	
	//Calculates the hypotenuse of the triangle based on the two input sides
	public double calculateHypotenuse() {
		//The formula needed to calculate the hypotenuse is:
		//Hypotenuse = square root of the sum of the adjacent side and opposite side squared
		//i.e where c = hypotenuse, a=adjacent side, b=opposite side
		//c = sqrt(a^2 + b^2)
		double hypotenuse;
		double sidesToPowerTwo;
		sidesToPowerTwo = Math.pow(adjacent, 2) + Math.pow(opposite,2);
		hypotenuse = Math.sqrt(sidesToPowerTwo);
		return hypotenuse;
	}
	
	//Calculates the perimeter of the triangle based on all three sides
	public double calculatePerimeter() {
		//The formula needed to calculate the perimeter is the sum of the three sides (including hypotenuse)
		//Perimeter = adjacent + opposite + hypothenuse
		//This method uses another public worker method calculateHypotenuse()
		double perimeter;
		perimeter = calculateHypotenuse() + adjacent + opposite;
		return perimeter;
	}
	
	//Calculates the area of the triangle based on the two input sides
	public double calculateArea() {
		//The formulae needed to calculate the area is the product of half of the adjacent side multiplied by the height of the opposite side.
		//Although, the order of the factors can be swapped around to retrieve the same calculation
		//Area = 1/2(or 0.5)*adjacent*opposite
		double area;
		area = (0.5 * adjacent) * opposite;
		return area;
	}
	
	//Returns a string with all values of properties and calculations of this class, to be printed to the console
	//after user input
	public String createReport() {
		String report = "";
		report += "REPORT:";
		//This and subsequent lines format the numerical values using String.format to the nearest 4 decimal places
		report += "\nAdjacent: " + String.format("%4.4f", adjacent); 
		report += "\nOpposite: " + String.format("%4.4f", opposite);
		report += "\nHypotenuse: " + String.format("%4.4f", calculateHypotenuse());
		report += "\nPerimeter: " + String.format("%4.4f", calculatePerimeter());
		report += "\nArea: " + String.format("%4.4f", calculateArea());
		return report;
	}
	
	
}
