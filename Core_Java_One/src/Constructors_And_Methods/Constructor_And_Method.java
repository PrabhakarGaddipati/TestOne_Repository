package Constructors_And_Methods;

public class Constructor_And_Method 
{

	// Constructor method	 
	  Constructor_And_Method() 
	  {
	    System.out.println("Constructor method is called when an object of it's class is created");
	  }
	 
	  // Main method where program execution begins	 
	  public static void main(String[] args) 
	  {
	    staticMethod();
	    Constructor_And_Method object = new Constructor_And_Method();
	                           object.nonStaticMethod();
	  }
	 
	  // Static method	 
	  static void staticMethod() 
	  {
	    System.out.println("Static method can be called without creating object");
	  }
	 
	  // Non static method	 
	  void nonStaticMethod() 
	  {
	    System.out.println("Non static method must be called by creating an object");
	  }
	  
	}

//Link :https://www.programmingsimplified.com/java/tutorial/java-methods

/*
Output:
-------
Static method can be called without creating object
Constructor method is called when an object of it's class is created
Non static method must be called by creating an object
*/	
 
	
