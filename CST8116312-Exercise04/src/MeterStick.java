/*
 * Lab Exercise 04
 * Professor: Mel Sanschagrin
 * Student: Michael Boisvenu-Landry
 * Section: 312
 * Submitted On: 18/03/22
 */

//Class responsible for verifying and 
//converting length of a physical meter stick
public class MeterStick {
	
	public static final double EXPECTED_LENGTH = 1.0;
	public static final double EPSILON = 0.0001;
	private double length;
	
	public MeterStick() {
		
	}
	
	public MeterStick(double length) {
		this.length = length;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	public double toCentimeters() {
		double centimeters;
		centimeters = length * 100;
		return centimeters;
	}
	
	public double toMillimeters() {
		double millimeters;
		millimeters = length * 1000;
		return millimeters;
	}
	
	
	public String toString() {
		String report = String.format("Meter stick length: %5.5f", length);
		
		return report;
	}
	
	
	public String verify() {
		String report;
		//Calculate difference
		double difference = Math.abs(EXPECTED_LENGTH - length);
		
		//Check if difference is lesser than EPSILON value of 0.0001
		if(difference <= EPSILON) {
			report = String.format("Meter stick is within tolerance of %5.5f.", EPSILON);
		}
		else {
			report = String.format("Meter stick is NOT within tolerance of %5.5f.", EPSILON);
		}
		
		return report;
	}
	
	
}
