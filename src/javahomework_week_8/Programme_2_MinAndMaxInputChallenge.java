package javahomework_week_8;
/*2. -Read the numbers from the console entered by the user and print the minimum
and maximum number the user has entered.
-Before the user enters the number, print the message Enter number:
-If the user enters an invalid number, break out of the loop and print the minimum and maximum
number.
Hint:
-Use an endless while loop.
-Create a class with the name MinAndMaxInputChallenge.*/


import java.util.Scanner;

public class Programme_2_MinAndMaxInputChallenge {
    // Calculating Maximum two numbers in Java

        public static void main(String[] args) {
            minmax();

        }
        public static void minmax() {
            Scanner obj = new Scanner(System.in);
            boolean a,b;
            System.out.println("Enter two numbers:");
            a = obj.hasNextInt();
            b = obj.hasNextInt();
            while (a&&b){
                int num1=obj.nextInt();
                int num2=obj.nextInt();
                if (num1>num2) {
                    System.out.println("Maximum number: " + num1);
                    System.out.println("Minimum number: " + num2);
                } else {
                    System.out.println("Minimum number: " + num1);
                    System.out.println("Maximum number: " + num2);
                }
            }
            System.out.println("Please enter valid input number");
            //break;


            //obj.close();
        }}




