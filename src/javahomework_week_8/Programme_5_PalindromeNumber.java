package javahomework_week_8;

import java.util.Scanner;

public class Programme_5_PalindromeNumber {
    public static void main(String[] args) {
        int lastDigit,sum =0, a;
        Scanner as = new Scanner(System.in);
        System.out.println("enter number to check palindrome or not ===>");
        int inputNumber = as.nextInt();

        a=inputNumber;
        //code to reverse a number
        while (a > 0) {
            lastDigit = a % 10;
            sum = (sum * 10) + lastDigit;
            a = a / 10;
        }
            // if given number equal to sum then number is palindrome otherwise not palindome
            if (sum == inputNumber)
                System.out.println(inputNumber + "==Number is palindrome");
            else
                System.out.println(inputNumber + "==Number is not palindrome");

        }
    }


