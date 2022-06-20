/*
 * STUDENT NAME: Michael Boisvenu-Landry
 * PROFESSOR NAME: Mel Sandschagrin
 * DUE DATE: 21/01/22
 * DESCRIPTION: A simple program that outputs a given ASCII character tree
 * to the console
 */
public class AsciiTree {

	//Point of execution of the algorithm
	public static void main(String[] args) {
		
		//Declare and initialize string array
		String[] asciiTreeArray = {
				"     ~~~~~~~       ",
				"  ~~~~~~~~~~~      ",
				"~~~~~~~~~~~~~~~~   ",
				"~~~~    ~~~~~      ",
				"  ||     ||    ~~~ ",
				"   ||   ||    ~~~~~",
				"     || |     ||   ",
				"      | |====||    ",
				"      | |          ",
				"      |O|          ",
				"      | |          ",
				"      | |          ",
				"     || ||         ",
				"****************   ",
				"****************   ",	
				"Program by Michaël Boisvenu-Landry"
		};
		
		//Begin iteration through asciiTreeArray
		//Use 'x' as the index of array, set to 0
		//Get length of asciiTreeArray to determine number of iterations
		
		for(int x = 0; x < asciiTreeArray.length; x++) {
			
			//Output to console asciiTreeArray at index of value of 'x'
			System.out.println(asciiTreeArray[x]);
		}

	}

}
