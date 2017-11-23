package f17nov23comp1030;

/**
 *
 * @author jwright
 */
public class ForLoopFallingExample {
    public static void main(String[] args)
    {
        System.out.printf("%-6s %-10s %-15s %-15s %n", "Time", 
                                                     "Height(m)",
                                                     "m/s @ impact",
                                                     "KPH @ impact");
        for (int time=1; time <= 6; time++)
        {
            System.out.printf("%3d %9.1f %10.1f %15.0f %n", time,
                                    Physics.calcHeight(time),
                                    Physics.calcSpeed(time),
                                    Physics.convertToKPH(Physics.calcSpeed(time)));
        }
    }
}
