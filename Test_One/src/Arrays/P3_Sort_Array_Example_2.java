package Arrays;


import java.util.Arrays;

public class P3_Sort_Array_Example_2 
{
 
   	public static void main(String[] args) 
   	{
 
		// Initialize unsorted long array
		long arrL[] = { 200, 400, 100, 500, 300 };
 
		// Print the Unsorted Array List
		System.out.println("The Unsorted Long Array is:");
		for (long num : arrL) 
		{
			System.out.println("Array Element is " + num);
		}
 
		// Sort the array
		Arrays.sort(arrL);
 
		// Print the Sorted Array List
		System.out.println("The sorted long array is:");
		for (long num : arrL) 
		{
			System.out.println("Array Element is " + num);
		}
	 }
  }


//Link : http://www.c4learn.com/programs/java/sort-elements-in-long-array/


/*Output:
============================
The Unsorted Long Array is:
Array Element is 200
Array Element is 400
Array Element is 100
Array Element is 500
Array Element is 300
The sorted long array is:
Array Element is 100
Array Element is 200
Array Element is 300
Array Element is 400
Array Element is 500*/



