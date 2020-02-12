	import java.util.Scanner;
	import java.lang.Math.*;
public class SphereVolume {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String intro = ("The purpose of this program is to calculate the diameter of a sphere"); 
		String purpose = ("Calculate volume");
		double diameter;
		double radius;
		double x = 4.0/3.0; //using this as a variable in order to make the calculations easier to read
		double volume = Math.PI*x; //using mathpi
		double radiusConversion; // this will be used later
		double volumeTotal;
		System.out.println(purpose);
		System.out.println(intro);
		System.out.println("Enter the diameter");
		diameter = scan.nextDouble(); //get diameter
		radius = diameter/2; //conversion 
		System.out.println("The radius is " + radius);
		radiusConversion = Math.pow(radius, 3); //using the radius and raising it to the 3rd power
		volumeTotal = volume*radiusConversion; //complete answer
		System.out.println("The volume is " + volumeTotal);
	
	
	}

}
