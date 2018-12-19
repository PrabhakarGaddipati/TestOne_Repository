
package Keyword_This;

public class keyword_this_as_method_parameter  
{
	    int a; 
	    int b; 
	      
	    // Default constructor 
	    keyword_this_as_method_parameter() 
	    { 
	        a = 10; 
	        b = 20; 
	    } 
	      
	    // Method that receives 'this' keyword as parameter 
	    void display(keyword_this_as_method_parameter obj) 
	    { 
	        System.out.println("a = " + a + "  b = " + b); 
	    } 
	   
	    // Method that returns current class instance 
	    void get() 
	    { 
	        display(this); 
	    } 
	  
	    public static void main(String[] args) 
	    { 
	    	keyword_this_as_method_parameter object = new keyword_this_as_method_parameter(); 
	        object.get(); 
	    } 
	} 



// Link : https://www.geeksforgeeks.org/this-reference-in-java/ (4th Program)