package Arrays;

public class Sum_Of_few_Numbers 
{
	public static void main(String[] args) 
	{      
		int my_array[] = {0,11, 24, 35, 74, 85, 69, 76, 87, 19, 110};
		int sum = 0;

		for (int i : my_array)
		      sum+= i;
		
		System.out.println("The sum is :" + sum);
	}
		
}
