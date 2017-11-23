/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package f17nov23comp1030;

/**
 *
 * @author jwright
 */
public class Physics {
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
