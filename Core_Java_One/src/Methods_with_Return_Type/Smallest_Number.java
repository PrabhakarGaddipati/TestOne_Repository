package Methods_with_Return_Type;

import java.util.Scanner;

public class Smallest_Number 
{
	

public static void main(String[] args)
{
    //Import the Scanner Related Classes
	Scanner in = new Scanner(System.in);
    
    
    System.out.print("Input the first number: ");
    double x = in.nextDouble();
    System.out.print("Input the Second number: ");
    double y = in.nextDouble();
    System.out.print("Input the third number: ");
    double z = in.nextDouble();
    
    //Calling the Smallest Method Here

    System.out.print("The smallest value is " + smallest(x, y, z)+"\n" );
}

	public static double smallest(double x, double y, double z)
	{
	   // return Math.min(Math.min(x, y), z);
	    return (x+y+z);
	}

//https://www.w3resource.com/java-exercises/method/java-method-exercise-1.php

}