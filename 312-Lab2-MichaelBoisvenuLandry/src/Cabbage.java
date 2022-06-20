public class Cabbage {
	
	//Properties to be used.
	private double weight;
	private double costPerKilogram;
	
	//Default constructor
	public Cabbage() {
		
	};
	//Overriden constructor
	public Cabbage(double weightValue, double costPerKilogramValue) {
		this.weight = weightValue;
		this.costPerKilogram = costPerKilogramValue;
	}
	//Sets the value of the weight property.
	public void setWeight(double weightValue) {
		this.weight = weightValue;
	}
	
	//Sets the value of the costPerKilogram property
	public void setCostPerKilogram(double costValue) {
		this.costPerKilogram = costValue;
	}
	
	//Returns the value of weight
	public double getWeight() {
		return weight;
	}
	
	//Returns the value of costPerKilogram
	public double getCostPerKilogram() {
		return costPerKilogram;
	}
	
	//Calculates and returns the price
	public double calculatePrice() {
		//Multiply the weight by the cost per kilogram and return
		double price = weight * costPerKilogram;
		return price;
	}
	
	//Prints details about cabbage
	public void printReport() {
		String report = "Weight: " + weight + "\n"
				+ "Cost Per Kilogram: "+ costPerKilogram + "\n"
				+ "Cabage Full Price: " + calculatePrice();
		
		System.out.println(report);
	}
}
