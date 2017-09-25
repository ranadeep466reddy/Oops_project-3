/**
 * Class Vehicle contains private variables for the number of wheels and the average number of miles per gallon
 * It also contains a constructor with integer arguments for the number of wheels and average miles per gallon. 
 *   
 * * @author Ranadeep Reddy Mulucuri
 *
 */
public class Vehicle {

	private int no_of_wheels;
	private int miles_per_gallon;
	
	public Vehicle()
	{
		no_of_wheels = 0;
		miles_per_gallon = 0;
	}
	
	public Vehicle(int no_of_wheels, int miles_per_gallon)
	{
		this.no_of_wheels = no_of_wheels;
		this.miles_per_gallon = miles_per_gallon;
	}
	
	public void setWheels(int newWheel)
	{
		no_of_wheels = newWheel;
	}
	
	public int getWheels()
	{
		return no_of_wheels;
	}
	public void setGallon(int newGallon)
	{
		miles_per_gallon = newGallon;
	}
	
	public int getGallon()
	{
		return miles_per_gallon;
	}
	
/***
 * toString() method that returns a String containing number of wheels and miles per gallon
 * 	
 * @return a String containing number of wheels and miles per gallon
 */
	
	public String toString()
	{
        return "number of wheels: " + no_of_wheels +" "+ " and miles per gallon: "+ miles_per_gallon;     
    }  
	
}
