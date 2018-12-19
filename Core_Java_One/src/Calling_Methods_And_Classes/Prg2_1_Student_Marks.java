/*Note : 
This program shows how we can create multiple methods in a class 
And how we can call one method from another method. */

package Calling_Methods_And_Classes;

public class Prg2_1_Student_Marks 
{
	String name;
    // Marks in various subjects
    int english;
    int telugu;
    int hindi;
    int maths;
    int science;
    int social;

    //Method-1 Calling
    int getLanguagesTotal()
    {
        return english + telugu + hindi;
    }

    //Method-2 Calling
    int getNonLanguagesTotal()
    {
        return maths + science + social;
    }

    //Method-3 Calling
    int getAllSubjectsTotal()
    {
        return getLanguagesTotal() + getNonLanguagesTotal();
    }

    //Method-4 Calling
    double getPCMPercentage()
    {
        return 100.0 * (maths + science) / 200.0;
    }

    //Method-5 Calling
    void printMarksSummary()
    {
        System.out.println("Languages: " + getLanguagesTotal());
        System.out.println("Non languages: " + getNonLanguagesTotal());
        System.out.println("PCM Percentage: " + getPCMPercentage());
        System.out.println("Total: " + getAllSubjectsTotal());
    }
 
    //Method-6 Calling
    void printMarksDetails()
    {
        System.out.println("English : " + english);
        System.out.println("Telugu : " + telugu);
        System.out.println("Hindi : " + hindi);
        System.out.println("Maths : " + maths);
        System.out.println("Science : " + science);
        System.out.println("Social : " + social);
    }
  }



