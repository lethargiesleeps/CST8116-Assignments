/*
 * Author Name: Michael Boisvenu-Landry
 * Lab Professor: Mel Sanschagrin
 * Due Date: 04/04/22
 * Description: Starter Code for Lab Exam 2 (22W) Section 312
 */

/*
 * This class abstracts breakfast cereal with fields for cups, and 
 * carbohydrates per cup in grams. There is a worker method that calculates
 * the total grams of carbohydrates given the number of cups and 
 * carbohydratesPerCup.
 */
public class Cereal {
	private double cups; // number of cups
	private double carbohydratesPerCup; // in grams per cup
	
	/*
	 * no-argument constructor, sets fields to zero
	 */
	public Cereal() {
		cups = 0.0;
		carbohydratesPerCup = 0.0;
	}

	/*
	 * accessor for cups
	 */
	public double getCups() {
		return cups;
	}

	/*
	 * mutator for cups
	 */
	public void setCups(double cups) {
		this.cups = cups;
	}

	/*
	 * accessor for carbohydratesPerCup, in grams per cup
	 */
	public double getCarbohydratesPerCup() {
		return carbohydratesPerCup;
	}

	/*
	 * mutator for carbohydratesPerCup, in grams per cup
	 */
	public void setCarbohydratesPerCup(double carbohydratePerCup) {
		this.carbohydratesPerCup = carbohydratePerCup;
	}
	
	/*
	 * This worker method calculates the total grams of carbohydrates given
     * the number of cups and carbohydratesPerCup.
	 */
	public double calculateCarbohydates() {
		double carbohydrates;
		carbohydrates = cups * carbohydratesPerCup;
		return carbohydrates;
	}

}

