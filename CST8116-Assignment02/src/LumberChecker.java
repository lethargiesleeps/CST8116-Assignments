/*
 * Student Name: Michael Boisvenu-Landry
 * Lab Professor: Mel Sanschagrin
 * Due Date: 25/03/22
 * Description: Assignment 02
 */

/*
 * This class is responsible for validating a piece of 2x4x8 lumber input by a user
 * against it's expected dimensions
 */
public class LumberChecker {
	
	//Max allowed difference between an expected dimension and enter dimension to determine if it falls within tolerance
	public static final double EPSILON = 0.0625;
	
	
	/*
	 * This method is responsible for validating the enter dimensions for a piece of lumber.
	 * It creates a string and appends whether certain dimensions are within the tolerance value of EPSILON
	 */
	public String validate(DimensionalLumber lumber) {

		String validationReport = ""; //The string that will be returned
		String appendString = ""; //Appends whether a dimension is inside/outside of tolerance to validationReport
		Boolean withinTolerance = true; //Used to dictate what validationReport will be prefixed by

		double lengthDifference = Math.abs(DimensionalLumber.EXPECTED_LENGTH - lumber.getLength());
		double thicknessDifference = Math.abs(DimensionalLumber.EXPECTED_THICKNESS - lumber.getThickness());
		double widthDifference = Math.abs(DimensionalLumber.EXPECTED_WIDTH - lumber.getWidth());

		//Check if any of the dimensions are negative, if they are lumber cannot be verified
		if(lumber.getLength() < 0 || lumber.getThickness() < 0 || lumber.getWidth() < 0) {
			validationReport = "Negative dimensions entered. Lumber cannot be verified.";
		}
		else{

			//Check length
			if(lengthDifference > EPSILON){
				appendString += String.format("Length is not within tolerance of %.5f. ", EPSILON);
				withinTolerance = false;
			}	
			else {
				appendString += "Length is within tolerance. ";
				
			}
			
			//Check thickness
			if(thicknessDifference > EPSILON){
				appendString += String.format("Thickness is not within tolerance of %.5f. ", EPSILON);
				withinTolerance = false;
			}
			else{
				appendString += "Thickness is within tolerance. ";
			}
				
			//Check width
			if(widthDifference > EPSILON){
				appendString += String.format("Width is not within tolerance of %.5f. ", EPSILON);
				withinTolerance = false;;
			}
			else{
				appendString += "Width is within tolerance. ";
			}

			//If any dimensions were not within tolerance, change validationReport output
			if(!withinTolerance){
				validationReport = "Dimension(s) is/are not within tolerance:\n";
			}
			else{
				validationReport = "Dimension(s) is/are within tolerance:\n";
			}
				

		}

		//Adds the two strings together for return
		validationReport += appendString;
		return validationReport;
	}
}
