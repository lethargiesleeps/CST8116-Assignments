/*
 * Lab Assignment 01
 * Professor: Mel Sanschagrin
 * Student: Michael Boisvenu-Landry
 * Section: 312
 * Submitted On: 11/02/22
 * 
 */

//Class TableCalculator is responsible for calculating the table amount
//and returning how many tables one can of varnish will cover.

public class VarnishCalculator {
	//Constant fields
		private static final double AREA_PER_CAN = 46800;
		private static final double PI = Math.PI;
		
		public static double calculateTableArea(double diameter) {
			//Formula to get area of a circle is A = Pi * (Diameter/2)^2
			//Declare returnable variable
			double area = 0;
			
			//Multiply pi by the given diameter divided by 2, to the power of 2
			area = PI * (Math.pow((diameter/2), 2)); //Using java.math class to utilize exponents
				
			return area;
		}
		
		public static double calculateTablesAmount(double diameter, int coatsOfVarnish) {
			//Declare returnable variable
			double result = 0;
			//Divide the maximum quantity in a can over varnish by
			//the product of the table's area and amount of coats needed
			result = AREA_PER_CAN /(calculateTableArea(diameter) * coatsOfVarnish);
			
			return result;
		}		
}
