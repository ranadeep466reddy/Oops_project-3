/**
 * MotorCycle is a subclass extending Vehicle class, containing a constructor that accepts the miles-per-gallon value as an argument 
 * and forces the number of wheels to the appropriate value—4 for a MotorCycle
 * 
 * @author Ranadeep Reddy Mulucuri
 *
 */
public class MotorCycle extends Vehicle{
	
	private int mc_wheels;
	private int mc_per_gallon;
	
public MotorCycle(int no_of_wheels,int miles_per_gallon)
{
	super(no_of_wheels,miles_per_gallon);
	this.mc_wheels = no_of_wheels;
}

}
