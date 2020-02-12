/**
   This program demonstrates how numeric types and operators behave in Java
 */
import java.util.Scanner;
public class NumericTypes {
	public static void main (String [] args) {
		//TASK #2 Create a Scanner object here 
		Scanner scan = new Scanner(System.in);														//identifier declarations
		final double NUMBER = 2.0;																		 // number of scores [no semicolon]
		//int score1 = 100;															 // first test score
		//int score2 = 95; 																		// second test score
		final int BOILING_IN_F = 212; 														// boiling temperature
		double fToC;															 // temperature in Celsius
		double average;														 // arithmetic average
		String output;															 // line of output to print out
		double  x = BOILING_IN_F-32;
		double y = 5.0/9.0;													//Task #2 declare a variable to hold the user’s temperature
		double c = x*y;
		//Task #2 prompt user to input score1
		int score1;															//Task #2 read score1 
		int score2;	
		double anotherTemp;	
		//double u = (anotherTemp-32);//Task #2 prompt user to input score2
		//Task #2 read score2 
		System.out.println("Enter the first score");	
		score1 = scan.nextInt();
		System.out.println("Enter the second score");	
		score2 = scan.nextInt();				
		// Find an arithmetic average
		average = (score1 + score2) / NUMBER;
		output = score1 + " and " + score2 + " have an average of " + average;	
		System.out.println(output);
		output = c + " in celsius is " + BOILING_IN_F + "  in fahrenheit";		
		System.out.println(output);
		System.out.println("Enter another temperature in Fahrenheit");		
		anotherTemp= scan.nextDouble();
		
		double u = (anotherTemp-32);
		double r = u*y;
		System.out.println("The temperature you put in is " + r + " in Celsius" );
		// Convert Fahrenheit temperatures to Celsius
		//System.out.println(BOILING_IN_F);
		//fToC = (5/9) * (BOILING_IN_F - 32);
		//output = fToC + " in Fahrenheit is " + BOILING_IN_F+ " in Celsius.";
		//System.out.println(output);
		//Task #2 prompt user to input another temperature
		//Task #2 read the user’s temperature in Fahrenheit
		//Task #2 convert the user’s temperature to Celsius
		//Task #2 print the user’s temperature in Celsius
		System.out.println("Goodbye"); 															// to show that the program is ended	
	}
}