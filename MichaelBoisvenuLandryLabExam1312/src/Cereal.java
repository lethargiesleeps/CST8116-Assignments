//This class Cereal is responsible for housing fields and methods needed to performing
//the end calculation.
public class Cereal {
	
	//private fields needed
	private double cups;
	private double carbohydratesPerCup;
	
	//Parameterless constructor
	public Cereal() {
		
	}
	
	//Field Mutators => Setters
	public void setCups(double cups) {
		this.cups = cups;
	}
	
	public void setCarbohydratesPerCup(double carbohydratesPerCup) {
		this.carbohydratesPerCup = carbohydratesPerCup;
	}
	
	//Field Accessors => Getters
	public double getCups() {
		return cups;
	}
	
	public double getCarbohyrdatesPerCup() {
		return carbohydratesPerCup;
	}
	
	//Worked method
	public double calculateTotalCarbs() {
		return cups * carbohydratesPerCup;
	}
	
}
