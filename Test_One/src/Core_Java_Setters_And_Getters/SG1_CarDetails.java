package Core_Java_Setters_And_Getters;

public class SG1_CarDetails 
{
	
	public static void main(String[] args)
    {

//-------------------------------------------------	
		/*
         * Create maruthiAltok10 car object and 
         * set the properties
         */
	
		SG1_Car maruthiAltok10 = new SG1_Car();

        maruthiAltok10.setBrand("Maruthi Alto");
        maruthiAltok10.setModel("k10");
        maruthiAltok10.setColor("Orange");

        displayCarInformation(maruthiAltok10);
        
//-------------------------------------------------
        /*
         * Create swift car object and 
         * set the properties
         */
        SG1_Car swift = new SG1_Car();

        swift.setBrand("Swift");
        swift.setModel("ZDI");
        swift.setColor("Red");
        
        displayCarInformation(swift);
        
//-------------------------------------------------	
        
        /*
         * Create maruthiAlto800 car object and 
         * set the properties
         */
        SG1_Car maruthiAlto800 = new SG1_Car();

        maruthiAlto800.setBrand("Maruthi Alto");
        maruthiAlto800.setModel("800");
        maruthiAlto800.setColor("Blue");
        
        displayCarInformation(maruthiAlto800);
        
      // System.out.println( "Details" +CarObject);

    }
	
//----------------------------------------------------	
	
	
   //By Using of "CarObject" He is Calling the Details from "SG1_Car" Class
    private static void displayCarInformation(SG1_Car CarObject)
    {
        System.out.println("Car Brand : " + CarObject.getBrand());
        System.out.println("Car Model : " + CarObject.getModel());
        System.out.println("Car Color : " + CarObject.getColor());
        System.out.println("--------------------------------");
    }

//-------------------------------------------------	
    
}



