package Arrays;

//Here Imported the - java.util.Arrays for "Arrays.sort(array)"
import java.util.Arrays;

public class P3_Sort_Array_Example_1 
{
	    public static void main(String[] args) 
	    {

	        int[] array = { 100, 20, 0, 200 };

	        // Call Arrays.sort on the int array.
	        Arrays.sort(array);

	        for (int elem : array) 
	        {
	            System.out.println(elem);
	        }
	    }
	}
 