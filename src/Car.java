/**
 * Car is a subclass extending Vehicle class, containing a constructor that accepts the miles-per-gallon value as an argument 
 * and forces the number of wheels to the appropriate value—2 for a Car
 * 
 * @author Ranadeep Reddy Mulucuri
 *
 */
public class Car extends Vehicle{
	
	private int no_of_wheels;
	private int miles_per_gallon;
	
public Car(int no_of_wheels,int miles_per_gallon)
{
	super(no_of_wheels,miles_per_gallon);
	this.no_of_wheels = no_of_wheels;
}
}
