package Passing_Objects_to_Methods;


	class Rectangle
	{
	    int length;
	    int width;

	    //Constructor 
	    Rectangle(int l, int b) 
	    {
	        length = l;
	        width = b;
	    }

	    void area(Rectangle r1) 
	    {
	        int areaOfRectangle = r1.length * r1.width;
	        System.out.println("Area of Rectangle : " + areaOfRectangle);
	    }
	 }

	class PassingObjects_to_Paramaters
	{
	    public static void main(String args[]) 
	    {
	    	Rectangle r1 = new Rectangle(10, 20);
	        r1.area(r1);
	    }
	}
	
	
//Link : http://www.c4learn.com/java/java-passing-object-as-parameter-to-method/
	
	