package Passing_Objects_to_Methods;


class Printers
{	
	public void print(Paper p)
	{
		p.setText("Get Data");
	}
	
 }

class Paper
{
	String text;
	
	public void setText(String t)
	{	
		text = t;			
	}
	
	public String getText()
	{
		System.out.println("Info");
		return text;
		
	}	
 }
 
 public class PlayingWithObjects
 {
	 public static void main (String args[])
	 {
	   Paper p = new Paper();
	   p.setText("Objects Passing");
	   System.out.println(p.getText());
	  
	   Printers hp = new Printers();
	   hp.print(p);
	   System.out.println(p.getText());
	 }
			 	 	 
  }
 
 
// Link : https://www.youtube.com/watch?v=mAoJtlLfrqg
	 
 