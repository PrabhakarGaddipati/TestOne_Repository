package Arrays;

public class P4_String_Array_Example 
{

	 public static void main(String[] args) 
	    {

	        // Create an array of four chars.
	        String[] values = new String[4];
	        
	        values[0] = "java";
	        values[1] = "Python";
	        values[2] = "Visual Studio";
	        values[3] = "Machine Learning";

	        // Loop over array with for-loop.
	        for (String value : values) 
	        {
	            System.out.println(value);
	        }
	    }
	}