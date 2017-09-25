/**
 * Title : Creating a class called Vehicle that acts as super class for MotorCycle,Car subclasses  
 * and displaying their number of wheels and average miles per gallon
 * 
 * Files : UseVehicle.java, Vehicle.java, Car.java, MotorCycle.java
 * 
 * Semester : FALL 2016
 * 
 * Author : Ranadeep Reddy Mulucuri
 * 
 * Email : RXR160330@UTDALLAS.EDU
 * 
 * Lecturer's Name : Nassim Sohaee
 * 
 * Course Section : MIS 6323.502
 */

import java.util.Scanner;
public class UseVehicle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int gallons;
		
		System.out.println("Enter value for average no.of miles per gallon (Integer): ");
		Scanner sc1 = new Scanner(System.in);
		gallons = sc1.nextInt();
		
		Vehicle car = new Vehicle(2,gallons);
		System.out.println(car);
		
		Vehicle motor_cycle = new Vehicle(4,gallons);
		System.out.println(motor_cycle);
		
		sc1.close();
	}

}
