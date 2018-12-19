package Core_Java_Setters_And_Getters;

class Rectangle 
{
	  int length;
	  int breadth;

	  //Setters and Getters Implementation
	  void setLength(int len)
	  {
	    length = len;
	  }

	  int getLength()
	  {
	    return length;
	  }

	}

	class RectangleDemo 
	{
	   public static void main(String args[]) 
	   {

		  Rectangle r1 = new Rectangle();	
		  r1.setLength(20);
	
		  int len = r1.getLength();
	
		  System.out.println("Length of Rectangle : " + len);

	   }
	}
	
//Link : http://www.c4learn.com/java/java-returning-value-from-method/	
	
	
//Output : Length of Rectangle : 20	
	
	
	