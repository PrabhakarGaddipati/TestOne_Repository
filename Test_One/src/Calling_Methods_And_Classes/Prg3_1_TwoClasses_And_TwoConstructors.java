package Calling_Methods_And_Classes;

  public class Prg3_1_TwoClasses_And_TwoConstructors 
  {
	      //Constructor
	      Prg3_1_TwoClasses_And_TwoConstructors() 
		  {
		    System.out.println("Constructor of Computer class.");
		  }
		 
		  void computer_method() 
		  {
		    System.out.println("Power gone! Shut down your PC soon...");
		  }
		 
		  public static void main(String[] args) 
		  {
			  Prg3_1_TwoClasses_And_TwoConstructors my = new Prg3_1_TwoClasses_And_TwoConstructors();
			  Prg3_2_TwoClasses_And_TwoConstructors your = new Prg3_2_TwoClasses_And_TwoConstructors();
		   
		      my.computer_method();
		      your.laptop_method();
		  }
	}


//Link : https://www.programmingsimplified.com/java/source-code/java-program-multiple-classes