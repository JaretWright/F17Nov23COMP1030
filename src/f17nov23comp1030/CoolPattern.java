
package f17nov23comp1030;

import java.util.Scanner;

/**
 *
 * @author jwright
 */
public class CoolPattern {
    public static void main(String[] args)
    {
        //prompt the user for the # of rows
        System.out.print("How many rows should be displayed?: ");
        
        //store the result
        Scanner keyboard = new Scanner(System.in);
        int rowTotal = keyboard.nextInt();
        
        //create a loop for the number of rows 
        for (int row = 1; row <= rowTotal; row++)
        {
            //create a loop for the number of columns
            for (int col=1; col <= row; col++)
                System.out.print("*");
            System.out.println();
        }
        
    }
}
