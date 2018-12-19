package ReUsable_UserDefined_Methods;

 public class P1_2_Method_for_Calling_Addition_Logic 
 {
	public static void main (String [] args)
	{
		
	  //Create Object
      P1_1_Method_with_Addition_Logic J1 = new P1_1_Method_with_Addition_Logic();

	  //Call Method
	  int x = J1.addition(10, 25, 35);
	  System.out.println(x);

	
	  //Type : 2
	  System.out.println(J1.addition(10, 25, 35));
	}
		
   }
