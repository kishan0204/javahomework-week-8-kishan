package javahomework_week_8;/*15. Display left angle triangle of * using nested for loops
 *
 * *
 * * *
 * * * *
 * * * * *
 */

import java.util.Scanner;

public class Programme_15_LeftTriangle {
    public static void main(String[] args) {


        int i, j, r;
        System.out.println("imput number of rowa(left angle triangle)");
        Scanner in = new Scanner(System.in);
        r = in.nextInt();
        for (i = 1; i <=r; i++)
        {
            for (j = i; j <= r; j++)
            System.out.print("   ");
            for (j = 1; j <= i; j++)
                System.out.print("*  ");
            System.out.println("");
        }
    }
}