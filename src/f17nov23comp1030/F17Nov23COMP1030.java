package f17nov23comp1030;

import java.util.Scanner;

/**
 *
 * @author jwright
 */
public class F17Nov23COMP1030 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //prompt the user to see how many seconds the brick 
        //dropped
        System.out.print("How many seconds was the brick falling?: ");
        
        //store their answer in a variable
        Scanner keyboard = new Scanner(System.in);
        double timeFalling = keyboard.nextDouble();
        
        //calculate and display the height of the bridge
        System.out.printf("The height of the bridge is: %.1f %n", calcHeight(timeFalling));
        
        //calculate and display the speed at impact (m/s)
        System.out.printf("The speed at impact is %.1f m/s %n", calcSpeed(timeFalling));
        
        //calculate and display the speed in KPH
        System.out.printf("That is %.0f KPH %n", convertToKPH( calcSpeed(timeFalling)));
    } //end of main method
    
    /**
     * This method will calculate the height something was dropped
     * from assuming it does not reach terminal velocity.
     */
    public static double calcHeight(double timeFalling)
    {
        //Distance = 0.5 * acceleration * time Falling ^2
        return 0.5 * 9.81 * Math.pow(timeFalling, 2);
    }
    
    /**
     * This method will calculate the speed at impact given
     * the time falling
     */
    public static double calcSpeed(double timeFalling)
    {
        //speed = at
        return 9.81 * timeFalling;
    }
    
    /**
     * This method will covert m/s into KPH
     */
    public static double convertToKPH(double mps)
    {
        return 3.6 * mps;
    }
    
}
