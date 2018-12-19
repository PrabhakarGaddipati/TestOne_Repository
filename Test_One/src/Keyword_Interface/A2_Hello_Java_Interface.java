package Keyword_Interface;


public class A2_Hello_Java_Interface implements A1_Hello_Interface
{

	public void sayHello()
	{
	    System.out.println("Hello Visitor !");
	}
	  
	  public static void main(String args[])
	  {
	    //create object of the class
		  A2_Hello_Java_Interface InterfaceExample = new A2_Hello_Java_Interface();
	    
		  //invoke sayHello(), declared in IntExample interface.
	      InterfaceExample.sayHello();
	      System.out.println(a); 
	  }
}

//Link : https://www.geeksforgeeks.org/interfaces-in-java/

