
/**
 * Demonstrate the use of variable.
 * 
 * @author (Alireza Barzin Zanganeh) 
 * @version (10/09/16)
 */
public class VariablesDemo
{
    private int feet;         // this is an "instance variable" aka "field"
    private String season;    // fields can be accessed throughout the class
    
    /**
     * Constructor for objects of class VariablesDemo
     */
    public VariablesDemo()
    {
        // instance variables are often initialized in the constructor
        feet = 5;     // assign a value to a variable
        season = "Winter";
        
        int x = 42;  // this is a "local variable". It can only be used in this constructor
    }
    
    /**
     * Demonstrate calculations with variables
     */
    public void calculate(int newFeet)  // newFeet is a "parameter" (a kind of variable)
    {                                   // newFeet can only be used in this method
        feet = newFeet;
        int inches = feet * 12;
        System.out.println(feet + " feet = " + inches + " inches");
        System.out.println("The season is " + season); // print the value of a variable
        
        int x = 0; // a local variable, different than the x above
        x = x + 1; // add 1 to the value of a variable
        x = x * 5 * x;
        x = x * x;
        x = 10 - x;
        System.out.println("'x' is " + x); // what do you think will be printed?
    }
        
}
