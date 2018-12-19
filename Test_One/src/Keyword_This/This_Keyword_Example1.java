package Keyword_This;



	//Java code for using 'this' keyword to
	//refer current class instance variables
	public class This_Keyword_Example1 
	{	
	    int a;
	    int b;
	     
	    // Parameterized constructor
	    This_Keyword_Example1(int a, int b)
	    {
	        this.a = a;
	        this.b = b;
	    }
	 
	    void display()
	    {
	        //Displaying value of variables a and b
	        System.out.println("a = " + a + "  b = " + b);
	    }
	 
	    public static void main(String[] args)
	    {
	    	This_Keyword_Example1 object = new This_Keyword_Example1(10, 20);
	        object.display();
	    }
	}

	
	//Link : https://www.geeksforgeeks.org/this-reference-in-java/