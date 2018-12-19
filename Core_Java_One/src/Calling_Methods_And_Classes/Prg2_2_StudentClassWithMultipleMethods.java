package Calling_Methods_And_Classes;

public class Prg2_2_StudentClassWithMultipleMethods 
{
	    public static void main(String arg[])
	    {
	    	Prg2_1_Student_Marks srini = new Prg2_1_Student_Marks();
	    		    	    	
	        srini.name = "Srinivas";
	        srini.english = 87;
	        srini.telugu = 84;
	        srini.hindi = 76;
	        srini.maths = 100;
	        srini.science = 92;
	        srini.social = 88;
	        
	        System.out.println("-------------------------------------------------");
	        System.out.println("Detailed Marks");
	        System.out.println("-------------------------------------------------");
	        
	        srini.printMarksDetails();
	        
	        System.out.println("-------------------------------------------------");
	        System.out.println();
	        System.out.println("-------------------------------------------------");
	        System.out.println("Summary Marks");
	        System.out.println("-------------------------------------------------");
	        
	        srini.printMarksSummary();
	        
	        System.out.println("-------------------------------------------------");    
	    }
	}




// Link : http://java.meritcampus.com/core-java-topics/java-multiple-methods-in-one-class-example-program
