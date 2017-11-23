package f17nov23comp1030;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author jwright
 */
public class ValidationExample {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int temperature;
        do
        {
            System.out.print("What is the temperature outside (in celcius): ");
            try{
                temperature = keyboard.nextInt();
            }
            catch (InputMismatchException e)
            {
                System.err.println("Only #'s are accepted");
                keyboard.nextLine();  //clear out the Scanners' buffer
                temperature = 10000;
            }
                
        } while (invalidTemp(temperature));
        
        
        if (temperature <= 0)
            System.out.println("Let's go skiing");
        else
            System.out.println("We want more snow!");
    }
    
    //what's the hottest recorded temperature on earth? 56.7 celcius
    //what's the coldest recorded temperature on earth? -89.2 celcius
    
    /**
     * This method will return true, if the temperature given
     * is invalid.  Valid range is -95 to +60
     * @param temperature integer in the range of -95 to 60 
     * @return  true if the temp is invalid
     */
    public static boolean invalidTemp(int temperature)
    {
        if (temperature < -95 || temperature > 60)
        {
            System.out.println("Valid temperatures are -95 to 60");
            return true;
        }
        else
            return false;
    }
}
