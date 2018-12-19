package Passing_Objects_to_Methods;

 public class Operation 
 {
		 int data=50;  
		  
		 void change(Operation op)
		 {  
		  op.data=op.data+100;//changes will be in the instance variable  
		 }  
		     
		    
		 public static void main(String args[])
		 {  
		   Operation op=new Operation();
		   System.out.println("Before change "+op.data);  
		   op.change(op);//passing object
		   System.out.println("After change "+op.data);  
		  
		 }  
  }  
 
 