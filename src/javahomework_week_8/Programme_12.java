package javahomework_week_8;/*12. Write a programme to input any number and check if it is prime or not.
(Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
17.... are the prime numbers.)*/

import java.util.Scanner;

public class Programme_12 {

    public static void main(String[] args) {
        System.out.println("Enter number to check===>");
        Scanner kk = new Scanner(System.in);
        int num = kk.nextInt();
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            //condition for nonprime number

            if (num % 1 == 0) {
                flag = true;
                break;
            }

        }
        if (!flag)
            System.out.println(num + "is aprime  number");
        else
            System.out.println(num + "is not prime number");

    }
}
