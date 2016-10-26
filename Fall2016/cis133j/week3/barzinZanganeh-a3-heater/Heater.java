
/**
 * Heater project
 * Simulate the behavior of a heater (thermostat)
 * @author Alireza Barzin Zanganeh
 * @version 10/16/16
 * Modifications:
 * Add 4 fileds.
 * Add a getter and setter for each field.
 * Define two constructors for the class, one with default values and the other with .
 * Define 'warmer' method to increase the temperature by the value of increment field if it is 
 *     not already maximum.
 * Define 'cooler' method to decrease the temperature by the value of increment field if it is 
 *     not already minimum.
 */
public class Heater
{
    // instance variables, define these four fileds.
    private int temperature;
    private int minimum; 
    private int maximum;
    private int increment;

    /**
     * Constructor for objects of class Heater with a default value for each field.
     */
    public Heater()
    {
        temperature = 50;
        minimum = 0;
        maximum = 100;
        increment = 1;
    }

    /**
     * Constructor for objects of class Heater that take parameter for each field from user.
     * 
     */
    public Heater(int aTemperature, int aMinimum, int aMaximum, int anIncrement)
    {
        temperature = aTemperature;
        minimum = aMinimum;
        maximum = aMaximum;
        increment = anIncrement;
    }
   
    /**
     * Return the temperature of the heater.
     */
    public int getTemperature()
    {
        return temperature;
    }
    
     /**
     * Set a new temperature of the heater.
     */
    public void setTemperature(int replaceTemperature)
    {
        temperature = replaceTemperature;
    }
    
    /**
     * Return the minimum temperature of the heater.
     */
    public int getMinimum()
    {
        return minimum;
    }
    
     /**
     * Set a new minimum temperatureof the heater.
     */
    public void setMinimum(int replaceMinimum)
    {
        minimum = replaceMinimum;
    }
    
    /**
     * Return the maximum temperature of the heater.
     */
    public int getMaximum()
    {
        return maximum;
    }
    
     /**
     * Set a new maximum temperature of the heater.
     */
    public void setMaximum(int replaceMaximum)
    {
        maximum = replaceMaximum;
    }
    
    /**
     * Return the increment value of the heater.
     */
    public int getIncrement()
    {
        return increment;
    }
    
     /**
     * Set a new increment value of the heater.
     */
    public void setIncrement(int replaceIncrement)
    {
        if (replaceIncrement <0) {
            System.out.println("Please enter a positive integer number.");
        }
        else {
            increment = replaceIncrement;
        }
    }
    
     /**
     * Define warmer method which increase the temperature by increment value. If it is become more 
     * than maximum temperature, it will not change the value of temperature. In case the temperature 
     * doesn't reach the maximum before call this method but if we increase it by increment value,
     * it will become more than maximum, it will set it to maximum and print an error message too.
     */
    public void warmer()
    {
        if ((temperature + increment) > maximum) {
            temperature = maximum; 
            System.out.println("You reach maximum temperature, it is not possible to increase it more.");
        }
        else {
             temperature += increment;
        }
    }
    
     /**
     * Define cooler method which decrease the temperature by increment value. If it is become less 
     * than minimum temperature, it will not change the value of temperature. In case the temperature 
     * doesn't reach the mimimum before call this method but if we decrease it by increment value,
     * it will become less than minimum, it will set it to minimum and print an error message too. 
     */
    public void cooler()
    {
        if ((temperature - increment) < minimum) {
            temperature = minimum; 
            System.out.println("You reach minimum temperature, it is not possible to decrease it more.");
        }
        else {
             temperature -= increment;
        }
    }
}