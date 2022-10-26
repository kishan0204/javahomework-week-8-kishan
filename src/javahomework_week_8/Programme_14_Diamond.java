package javahomework_week_8;/*14. Write a program in Java to display the pattern like a diamond.
While loop
*
***
*****
*******
*********
***********
*************
***********
*********
*******
*****
***
*
*/

import java.util.Scanner;

public class Programme_14_Diamond {
        public static void main(String[] args) {


                int i, j, r;
                System.out.println("imput number of rows (half the diamond):");
                Scanner aa = new Scanner(System.in);
                r = aa.nextInt();
                for (i=0;i<=r;i++)
                {
                        for(j=1;j<=r-i;j++)
                                System.out.println("");
                        for (j=1;j<=2*i-1;j++)
                                System.out.println("*");
                        System.out.println("");

                }
                      for (i=r-1;i>=1;i--)
                      {
                              for (j=1;j<=r-i;j++)
                                      System.out.println(" ");
                              for (j=1;j<=2*i-1;j++)
                                      System.out.println("*");
                              System.out.println("");
                      }

        }
}