/*
 * Lab Assignment 01
 * Professor: Mel Sanschagrin
 * Student: Michael Boisvenu-Landry
 * Section: 312
 * Submitted On: 11/02/22
 * 
 */

//Object for holding properties of a table
public class Table {
	
	//The table class contains the properties needed to perform calculations
	//using the TableCalculator class
	//
	
	//Properties
	private double diameter;
	private int coatsOfVarnish;
	
	//Default constructor
	public Table() {
		//Set properties to some default values
		this.diameter = 0.0;
		this.coatsOfVarnish = 0;
	}
	
	//Constructor with parameters
	public Table(double diameter, int coatsOfVarnish) {
		this.diameter = diameter;
		this.coatsOfVarnish = coatsOfVarnish;
	}
	//Mutators
	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	public void setCoatsOfVarnish(int coatsOfVarnish) {
		this.coatsOfVarnish = coatsOfVarnish;
	}
	
	//Accssesors
	public double getDiameter(){
		return diameter;
	}
	public int getCoatsOfVarnish() {
		return coatsOfVarnish;
	}
	
	//Simple report of object to be printed to console
	public String printReport() {
		return    "=====Table Properties=====" 
				+ "\nTable Diameter: " + diameter
				+ "\nCoats of varnish needed: " + coatsOfVarnish
				+ "\n==========================\n";
	}
}
